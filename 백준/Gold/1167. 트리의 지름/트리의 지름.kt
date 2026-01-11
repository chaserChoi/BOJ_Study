import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.util.ArrayList

// 간선 정보 데이터 클래스
data class Edge(val to: Int, val weight: Int)

// 전역
lateinit var graph: ArrayList<ArrayList<Edge>>
lateinit var visited: BooleanArray
var maxDistance = 0
var farthestNode = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val v = br.readLine().toInt() // 정점 개수

    graph = ArrayList()
    for (i in 0..v) {
        graph.add(ArrayList())
    }

    for (i in 0 ..< v) {
        val st = StringTokenizer(br.readLine())
        val startNode = st.nextToken().toInt()

        while (true) {
            val nextToken = st.nextToken().toInt()

            // -1 -> 해당 줄 입력 종료
            if (nextToken == -1) break

            val targetNode = nextToken
            val distance = st.nextToken().toInt()

            graph[startNode].add(Edge(targetNode, distance))
        }
    }

    // 임의의 정점에서 가장 먼 정점 찾기
    visited = BooleanArray(v + 1)
    maxDistance = 0
    dfs(1, 0)

    // 위에서 찾은 가장 먼 정점(farthestNode)에서 다시 가장 먼 정점까지 거리
    visited = BooleanArray(v + 1)
    maxDistance = 0
    dfs(farthestNode, 0)

    println(maxDistance)
}

/**
 * dfs
 * current: 현재 노드 번호
 * dist: 시작점 ~ 현재 노드 누적 거리
 */
fun dfs(current: Int, dist: Int) {
    // 방문 처리
    visited[current] = true

    // 현재까지 거리가 기록된 최대 거리보다 크면 갱신
    if (dist > maxDistance) {
        maxDistance = dist
        farthestNode = current
    }

    // 연결된 인접 노드 탐색
    for (edge in graph[current]) {
        if (!visited[edge.to]) {
            dfs(edge.to, dist + edge.weight)
        }
    }
}
