import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    
    val t = br.readLine().toInt()
    
    repeat(t) {
        val n = br.readLine().toInt()
        
        // 스티커 점수 저장
        val dp = Array(2) { IntArray(n) }
        
        // 첫 번째 줄
        var st = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            dp[0][i] = st.nextToken().toInt()
        }
        
        // 두 번째 줄
        st = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            dp[1][i] = st.nextToken().toInt()
        }
        
        // dp (n = 1 -> 반복문 돌지 않고 바로 출력)
        if (n >= 2) {
            // 두 번째 열(index = 1) 초기화: 대각선 방향만 가능
            dp[0][1] += dp[1][0]
            dp[1][1] += dp[0][0]
            
            // 세 번째 열(index = 2) ~ N번째 열 점화식
            for (i in 2 until n) {
                // 위쪽 스티커(0행) 떼는 경우
                dp[0][i] += max(dp[1][i - 1], dp[1][i - 2])
                
                // 아래쪽 스티커(1행) 떼는 경우
                dp[1][i] += max(dp[0][i - 1], dp[0][i - 2])
            }
        }
        
        sb.append(max(dp[0][n - 1], dp[1][n - 1])).append("\n")
    }
    
    println(sb)
}
