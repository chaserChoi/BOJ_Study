import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val str1 = br.readLine()
    val str2 = br.readLine()
    val n = str1.length
    val m = str2.length
    
    val dp = Array(n + 1) { IntArray(m + 1) }
    
    for (i in 1..n) {
        for (j in 1..m) {
            if (str1[i - 1] == str2[j - 1]) {
                // 문자가 같다면 대각선 왼쪽 위 값 + 1
                dp[i][j] = dp[i - 1][j - 1] + 1
            } else {
                // 문자가 다르면 위쪽 값 & 왼쪽 값 중 max
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }
    
    // 배열 마지막 칸의 최종 LCS 길이
    println(dp[n][m])
}
