import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.StringTokenizer
import java.util.ArrayList

// 도착 도시 & 비용 저장하는 데이터 클래스
data class Node(val id: Int, val cost: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return this.cost - other.cost
    }
}

const val INF = 100_000_000 * 1000 + 1 // 최대 비용 * 최대 정점 수보다 큰 값

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt() // 도시 개수
    val m = br.readLine().toInt() // 버스 개수

    // 인접 리스트 초기화
    val graph = ArrayList<ArrayList<Node>>()
    for (i in 0..n) {
        graph.add(ArrayList())
    }

    // 버스 정보
    repeat(m) {
        val st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val v = st.nextToken().toInt()
        val w = st.nextToken().toInt()

        graph[u].add(Node(v, w))
    }

    // 출발점 & 도착점
    val st = StringTokenizer(br.readLine())
    val startCity = st.nextToken().toInt()
    val endCity = st.nextToken().toInt()

    val (minCost, path) = dijkstra(n, graph, startCity, endCity)

    val sb = StringBuilder()
    sb.append(minCost).append("\n") // 최소 비용
    sb.append(path.size).append("\n") // 경로에 포함된 도시 개수

    for (city in path) {
        sb.append(city).append(" ") // 도시 경로 순서대로
    }

    println(sb)
}

fun dijkstra(
        n: Int,
        graph: ArrayList<ArrayList<Node>>,
        start: Int, end: Int): Pair<Int, List<Int>> {

    val dist = IntArray(n + 1) { INF }
    val route = IntArray(n + 1) { 0 } // 경로 복원을 위한 이전 도시 기록 배열
    val pq = PriorityQueue<Node>()

    // 시작점
    dist[start] = 0
    pq.offer(Node(start, 0))

    while (pq.isNotEmpty()) {
        val current = pq.poll()
        val curIdx = current.id
        val curCost = current.cost

        // 이미 처리된 경로보다 비용이 크다면 스킵
        if (curCost > dist[curIdx]) continue

        if (curIdx == end) {
            break
        }

        for (next in graph[curIdx]) {
            val nextCost = curCost + next.cost

            if (nextCost < dist[next.id]) {
                dist[next.id] = nextCost
                route[next.id] = curIdx // next로 가기 직전 도시 = curIdx
                pq.offer(Node(next.id, nextCost))
            }
        }
    }

    // 경로 역추적
    val pathList = ArrayList<Int>()
    var current = end

    while (current != 0) {
        pathList.add(current)
        if (current == start) break // 시작점 도달 시 종료
        current = route[current]
    }

    // 역추적으로 인한 순서 복원 (Start -> End)
    pathList.reverse()

    return Pair(dist[end], pathList)
}