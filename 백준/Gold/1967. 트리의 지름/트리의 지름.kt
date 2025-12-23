import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 간선 정보 데이터 클래스
data class Edge(val to: Int, val weight: Int)

// 전역
lateinit var graph: ArrayList<ArrayList<Edge>>
lateinit var visited: BooleanArray
var maxDistance = 0
var farthestNode = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt() // 노드 개수

    // 인접 리스트
    graph = ArrayList()
    for (i in 0..n) {
        graph.add(ArrayList())
    }

    // 간선 정보 입력
    repeat(n - 1) {
        val st = StringTokenizer(br.readLine())
        val parent = st.nextToken().toInt()
        val child = st.nextToken().toInt()
        val weight = st.nextToken().toInt()

        // 트리의 지름 구할 때 양방향으로 이동 가능해야 함
        graph[parent].add(Edge(child, weight))
        graph[child].add(Edge(parent, weight))
    }

    // 노드 = 1 => 지름 = 0
    if (n == 1) {
        println(0)
        return
    }
    
    // 임의 노드에서 가장 먼 노드(farthestNode)
    visited = BooleanArray(n + 1)
    maxDistance = 0
    dfs(1, 0)
    
    // 위에서 찾은 가장 먼 노드(farthestNode)에서 다시 가장 먼 노드까지 거리
    visited = BooleanArray(n + 1)
    maxDistance = 0
    dfs(farthestNode, 0)
    
    // result
    println(maxDistance)
}

/**
 * dfs 메서드
 * @current: 현재 노드
 * @dist: 현재까지의 거리
 */
fun dfs(current: Int, dist: Int) {
    // 방문 처리
    visited[current] = true
    
    // 현재까지의 거리가 기록된 max 거리보다 크다면 => 갱신
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