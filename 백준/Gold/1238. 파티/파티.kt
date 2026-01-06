import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.StringTokenizer
import kotlin.math.max

// 정점 & 비용 저장하는 데이터 클래스 (오름차순 정렬을 위한 Comparable 구현)
data class Node(val id: Int, val time: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return this.time - other.time
    }
}

// 상수
const val INF = 100_000_000

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt() // 마을(학생) 수
    val m = st.nextToken().toInt() // 도로 수
    val x = st.nextToken().toInt() // 파티 장소

    // 정방향 그래프 (x -> 집)
    val graph = ArrayList<ArrayList<Node>>()
    // 역방향 그래프 (집 -> x)
    val reverseGraph = ArrayList<ArrayList<Node>>()

    for (i in 0..n) {
        graph.add(ArrayList())
        reverseGraph.add(ArrayList())
    }

    // 도로 정보
    repeat(m) {
        st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val v = st.nextToken().toInt()
        val t = st.nextToken().toInt()

        // 정방향: u -> v 비용 = t
        graph[u].add(Node(v, t))
        // 역방향: v -> u 비용 = t (방향만 뒤집음)
        reverseGraph[v].add(Node(u, t))
    }

    // x에서 각 마을로 돌아가는 최단 시간 (정방향)
    val distFromX = dijkstra(x, n, graph)

    // 각 마을에서 x로 가는 최단 시간 (역방향)
    val distToX = dijkstra(x, n, reverseGraph)

    // 왕복 시간 중 max
    var maxTime = 0
    for (i in 1..n) {
        if (distFromX[i] != INF && distToX[i] != INF) {
            maxTime = max(maxTime, distFromX[i] + distToX[i])
        }
    }

    println(maxTime)
}

fun dijkstra(start: Int, n: Int, adj: ArrayList<ArrayList<Node>>): IntArray {
    val dist = IntArray(n + 1) { INF }
    val pq = PriorityQueue<Node>()

    dist[start] = 0
    pq.offer(Node(start, 0))

    while (pq.isNotEmpty()) {
        val current = pq.poll()
        val curIdx = current.id
        val curTime = current.time

        // 이미 더 짧은 경로로 방문한 적이 있다면
        if (curTime > dist[curIdx]) continue

        for (next in adj[curIdx]) {
            val nextTime = curTime + next.time
            if (nextTime < dist[next.id]) {
                dist[next.id] = nextTime
                pq.offer(Node(next.id, nextTime))
            }
        }
    }

    return dist
}
