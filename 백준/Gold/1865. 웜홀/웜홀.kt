import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 간선 정보 데이터 클래스
data class Edge(val u: Int, val v: Int, val weight: Int)

// 상수
const val INF = 1_000_000_000

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    val tcStr = br.readLine() ?: return
    val tc = tcStr.toInt()

    repeat(tc) {
        val stHead = StringTokenizer(br.readLine())
        val n = stHead.nextToken().toInt() // 지점 수
        val m = stHead.nextToken().toInt() // 도로 수
        val w = stHead.nextToken().toInt() // 웜홀 개수

        val edges = ArrayList<Edge>()

        // 도로 정보 입력
        repeat(m) {
            val st = StringTokenizer(br.readLine())
            val s = st.nextToken().toInt()
            val e = st.nextToken().toInt()
            val t = st.nextToken().toInt()
            edges.add(Edge(s, e, t))
            edges.add(Edge(e, s, t))
        }

        // 웜홀 정보 입력 (단방향, 음수 가중치)
        repeat(w) {
            val st = StringTokenizer(br.readLine())
            val s = st.nextToken().toInt()
            val e = st.nextToken().toInt()
            val t = st.nextToken().toInt()
            edges.add(Edge(s, e, -t))
        }

        // 벨만-포드 알고리즘
        if (bellmanFord(n, edges)) {
            sb.append("YES\n")
        } else {
            sb.append("NO\n")
        }
    }
    print(sb)
}

fun bellmanFord(n: Int, edges: ArrayList<Edge>): Boolean {
    val dist = IntArray(n + 1) { INF }

    // 시작점
    dist[1] = 0

    // n - 1번 모든 간선에 대해 완화 수행
    for (i in 1 until n) {
        for (edge in edges) {
            val u = edge.u
            val v = edge.v
            val w = edge.weight

            if (dist[v] > dist[u] + w) {
                dist[v] = dist[u] + w
            }
        }
    }

    // 음수 사이클 여부 확인
    for (edge in edges) {
        val u = edge.u
        val v = edge.v
        val w = edge.weight

        if (dist[v] > dist[u] + w) {
            // 더 작은 값으로 갱신 일어난다면 -> 음수 사이클 존재
            return true
        }
    }

    return false
}
