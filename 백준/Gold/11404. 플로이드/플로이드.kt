import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.min

// 오버플로우 방지 상수
const val INF = 100_000_000

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val n = br.readLine().toInt() // 도시 개수
    val m = br.readLine().toInt() // 버스 개수

    // 최단 거리 테이블 
    val dist = Array(n + 1) { IntArray(n + 1) { INF } }

    // 자기 자신으로 가는 비용은 0으로 초기화
    for (i in 1..n) {
        dist[i][i] = 0
    }

    // input
    repeat(m) {
        val st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val v = st.nextToken().toInt()
        val cost = st.nextToken().toInt()

        // 시작 도시와 도착 도시를 연결하는 노선이 하나가 아닐 수 있으므로
        // 가장 비용 적은 노선 저장
        dist[u][v] = min(dist[u][v], cost)
    }

    // 플로이드-워셜 알고리즘 수행
    // k: 거쳐가는 노드, i: 출발 노드, j: 도착 노드
    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                // i -> k 경로와 k -> j 경로가 존재할 때만 갱신 (오버플로우 방지)
                if (dist[i][k] != INF && dist[k][j] != INF) {
                    dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
                }
            }
        }
    }

    // result
    val sb = StringBuilder()
    for (i in 1..n) {
        for (j in 1..n) {
            // 갈 수 없는 경우(INF) -> 0
            if (dist[i][j] == INF) {
                sb.append("0 ")
            } else {
                sb.append("${dist[i][j]} ")
            }
        }
        sb.append("\n")
    }
    
    print(sb)
}