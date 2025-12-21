import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.StringTokenizer
import kotlin.math.min

/**
 * Boj 1504 - 특정한 최단 경로
 */

// 정점 정보 & 비용 담을 데이터 클래스
data class Node(val index: Int, val weight: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return this.weight - other.weight
    }
}

// 오버플로우 방지용 상수
const val INF = 200_000_000

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt() // 정점 개수
    val e = st.nextToken().toInt() // 간선 개수

    // 인접 리스트
    val graph = ArrayList<ArrayList<Node>>()
    for (i in 0..n) {
        graph.add(ArrayList())
    }

    // 간선 정보 입력
    repeat(e) {
        st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val v = st.nextToken().toInt()
        val w = st.nextToken().toInt()

        graph[u].add(Node(v,w))
        graph[v].add(Node(u,w))
    }

    // 반드시 거쳐야 하는 두 정점
    st = StringTokenizer(br.readLine())
    val v1 = st.nextToken().toInt()
    val v2 = st.nextToken().toInt()

    // dijkstra
    val distFrom1 = dijstra(n, graph, 1)
    val distFromV1 = dijstra(n, graph, v1)
    val distFromV2 = dijstra(n, graph, v2)

    // 1 -> v1 -> v2 -> n
    val path1 = if (distFrom1[v1] != INF && distFromV1[v2] != INF && distFromV2[n] != INF) {
        distFrom1[v1] + distFromV1[v2] + distFromV2[n]
    } else {
        INF
    }

    // 1 -> v2 -> v1 -> n
    val path2 = if (distFrom1[v2] != INF && distFromV2[v1] != INF && distFromV1[n] != INF) {
        distFrom1[v2] + distFromV2[v1] + distFromV1[n]
    } else {
        INF
    }
    
    val ans = min(path1, path2)
    
    if (ans >= INF) {
        println(-1)
    } else {
        println(ans)
    }
}

// dijstra 메서드
fun dijstra(n: Int, graph: ArrayList<ArrayList<Node>>, start: Int): IntArray {
    val dist = IntArray(n + 1) { INF }
    val pq = PriorityQueue<Node>()

    dist[start] = 0
    pq.offer(Node(start, 0))

    while (pq.isNotEmpty()) {
        val current = pq.poll()
        val curIndex = current.index
        val curWeight = current.weight

        // 이미 처리된 경로보다 비용 크다면 => 무시
        if (curWeight > dist[curIndex]) continue

        for (next in graph[curIndex]) {
            val nextIndex = next.index
            val nextWeight = curWeight + next.weight

            if (nextWeight < dist[nextIndex]) {
                dist[nextIndex] = nextWeight
                pq.offer(Node(nextIndex, nextWeight))
            }
        }
    }
    return dist
}
