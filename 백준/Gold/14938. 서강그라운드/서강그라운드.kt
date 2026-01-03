import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

// 오버플로우 방지
const val INF = 100_000_000

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt() // 지역 개수
    val m = st.nextToken().toInt() // 수색 범위
    val r = st.nextToken().toInt() // 길 개수

    val items = IntArray(n + 1) // 각 구역 아이템 수
    st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        items[i] = st.nextToken().toInt()
    }

    // 최단 거리 테이블 초기화
    val dist = Array(n + 1) { IntArray(n + 1) { INF } }

    // 자기 자신으로 가는 거리 = 0
    for (i in 1..n) {
        dist[i][i] = 0
    }

    // 길 정보 입력 (양방향)
    repeat(r) {
        st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val l = st.nextToken().toInt()

        // 양방향 연결
        dist[a][b] = min(dist[a][b], l)
        dist[b][a] = min(dist[b][a], l)
    }

    for (k in 1..n) { // k = 거쳐가는 노드
        for (i in 1..n) { // i = 출발 노드
            for (j in 1..n) { // j = 도착 노드
                if (dist[i][k] != INF && dist[k][j] != INF) {
                    dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
                }
            }
        }
    }

    var maxItems = 0 // 각 지역을 낙하 지점으로 선정했을 때 얻을 수 있는 아이템 수
     for (i in 1..n) {
         var currentItems = 0

         // i 번째 지역에 떨어졌을 때, j 번째 지역까지 갈 수 있는지 확인
         for (j in 1..n) {
             if (dist[i][j] <= m) {
                 currentItems += items[j]
             }
         }

         maxItems = max(maxItems, currentItems)
     }

    println(maxItems)
}