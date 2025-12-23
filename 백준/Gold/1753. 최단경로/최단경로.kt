import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.StringTokenizer

// 정점 정보 & 비용 담을 데이터 클래스
data class Node(val vertex: Int, val weight: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return this.weight - other.weight
    }
}

// 오버플로우 방지용 상수
const val INF = 200_000_000

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val v = st.nextToken().toInt() // 정점 개수
    val e = st.nextToken().toInt() // 간선 개수
    
    val startNode = br.readLine().toInt()

    // 인접 리스트
    val graph = ArrayList<ArrayList<Node>>()
    for (i in 0..v) {
        graph.add(ArrayList())
    }

    // 간선 정보 입력
    repeat(e) {
        st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val target = st.nextToken().toInt()
        val w = st.nextToken().toInt()

        graph[u].add(Node(target,w))
    }

    // 반드시 거쳐야 하는 두 정점
    val dist = dijstra(v, graph, startNode)

    // result
    val sb = StringBuilder()
    for (i in 1..v) {
        if (dist[i] == INF) {
            sb.append("INF\n")
        } else {
            sb.append(dist[i]).append("\n")
        }
    }
    print(sb)
}

// dijstra 메서드
fun dijstra(v: Int, graph: ArrayList<ArrayList<Node>>, start: Int): IntArray {
    val dist = IntArray(v + 1) { INF }
    val pq = PriorityQueue<Node>()

    dist[start] = 0
    pq.offer(Node(start, 0))

    while (pq.isNotEmpty()) {
        val current = pq.poll()
        val curIndex = current.vertex
        val curWeight = current.weight

        // 이미 처리된 경로보다 비용 크다면 => 무시
        if (curWeight > dist[curIndex]) continue

        for (next in graph[curIndex]) {
            val nextIndex = next.vertex
            val nextWeight = curWeight + next.weight

            if (nextWeight < dist[nextIndex]) {
                dist[nextIndex] = nextWeight
                pq.offer(Node(nextIndex, nextWeight))
            }
        }
    }
    return dist
}
