import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val n = br.readLine().toInt() // 집의 수
    
    // dp[i][0] = 빨강, dp[i][1] = 초록, dp[i][2] = 파랑
    val dp = Array(n) { IntArray(3) }
    
    // 첫 번째 집 -> 이전 집이 없으므로 입력값 그대로 저장
    var st = StringTokenizer(br.readLine())
    dp[0][0] = st.nextToken().toInt() // r
    dp[0][1] = st.nextToken().toInt() // g
    dp[0][2] = st.nextToken().toInt() // b
    
    // 두 번째 집 -> N까지 반복
    for (i in 1 until n) {
        st = StringTokenizer(br.readLine())
        val r = st.nextToken().toInt()
        val g = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        
        // i번째 집 빨강 
        // 이전 집(i - 1) -> 초록 or 파랑 (그 중 최솟값)
        dp[i][0] = r + min(dp[i - 1][1], dp[i - 1][2])
        
        // i번째 집 초록
        // 이전 집(i - 1) -> 빨강 or 파랑
        dp[i][1] = g + min(dp[i - 1][0], dp[i - 1][2])
        
        // i번째 집 파랑
        // 이전 집(i - 1) -> 빨강 or 초록
        dp[i][2] = b + min(dp[i - 1][0], dp[i - 1][1])
    }
    
    // 마지막 집(n - 1) 칠한 결과 중 가장 작은 값
    val result = min(dp[n - 1][0], min(dp[n - 1][1], dp[n - 1][2]))
    
    println(result)
}
