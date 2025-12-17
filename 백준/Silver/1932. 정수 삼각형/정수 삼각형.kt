import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    // 삼각형의 크기
    val n = br.readLine().toInt()
    val dp = Array(n) { IntArray(n) }
    
    // 입력
    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        for (j in 0..i) {
            dp[i][j] = st.nextToken().toInt()
        }
    }
    
    // dp (위 -> 아래로 누적 합 계산)
    // 0 번째 = 그대로 두기, 1 번째부터 시작
    for (i in 1 until n) {
        for (j in 0..i) {
            when (j) {
                // 왼쪽 가장자리 => 바로 위(i - 1)의 0번 인덱스에서만 올 수 있음
                0 -> {
                    dp[i][j] += dp[i - 1][0]
                }
                // 오른쪽 가장자리 => 바로 위(i - 1)의 마지막 인덱스(j - 1)에서만 올 수 있음
                i -> {
                    dp[i][j] += dp[i - 1][j - 1]
                }
                // 가운데 => 왼쪽 대각선 위 & 오른쪽 대각선 위 중 max 선택
                else -> {
                    dp[i][j] += max(dp[i - 1][j - 1], dp[i - 1][j])
                }
            }
        }
    }
    
    var result = 0
    // 마지막 층(n - 1) 값들 중 max 출력
    for (j in 0 until n) {
        if (dp[n - 1][j] > result) {
            result = dp[n - 1][j]
        }
    }
    
    println(result)
}

