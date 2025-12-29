import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val n = br.readLine().toInt()
    
    // 수열 
    val arr = IntArray(n)
    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        arr[i] = st.nextToken().toInt()
    }

    // 1. 왼쪽 -> 오른쪽으로 가는 증가 수열
    val r_dp = IntArray(n) { 1 } // 기본값 = 1(최소 길이)
    for (i in 0 until n) {
        for (j in 0 until i) {
            // 현재 수(arr[i]) > 이전 수(arr[j]) -> 증가 수열 가능
            if (arr[i] > arr[j]) {
                r_dp[i] = max(r_dp[i], r_dp[j] + 1)
            }
        }
    }

    // 2. 오른쪽 -> 왼쪽으로 가는 감소 수열
    val l_dp = IntArray(n) { 1 }
    for (i in n - 1 downTo 0) {
        for (j in n - 1 downTo i + 1) {
            // 현재 수(arr[i]) > 오른쪽 수(arr[j]) -> 감소 수열 가능
            if (arr[i] > arr[j]) {
                l_dp[i] = max(l_dp[i], l_dp[j] + 1)
            }
        }
    }

    // 3. 두 DP 테이블을 합쳐 max 찾기
    var maxLen = 0
    for (i in 0 until n) {
        // 해당 지점이 피크일 때의 길이 = 증가 부분 + 감소 부분 - 1 (피크 중복 제거)
        val currentLen = r_dp[i] + l_dp[i] - 1
        if (currentLen > maxLen) {
            maxLen = currentLen
        }
    }

    println(maxLen)
}