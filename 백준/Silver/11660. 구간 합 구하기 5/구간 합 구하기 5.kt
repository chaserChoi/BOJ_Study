import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    
    val dp = Array(n + 1) { IntArray(n + 1) }
    
    for (i in 1..n) {
        st = StringTokenizer(br.readLine())
        for (j in 1..n) {
            val currentNum = st.nextToken().toInt()
            
            // 점화식 = 위 + 왼쪽 - 중복 대각선 + 현재 값
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + currentNum
        }
    }
    
    val sb = StringBuilder()
    
    // 구간 합
    repeat(m) {
        st = StringTokenizer(br.readLine())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()
        
        // 구간 합 공식 적용: 전체 - 위쪽 - 왼쪽 + 중복 제거
        val result = dp[x2][y2] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1 - 1]
        
        sb.append(result).append("\n")
    }
    
    print(sb)
}
