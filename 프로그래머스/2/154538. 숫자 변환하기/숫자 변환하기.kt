import kotlin.math.min

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        if (x == y) return 0
        
        val INF = Int.MAX_VALUE
        
        val dp = IntArray(y + 1) { INF }
        
        dp[x] = 0
        
        for (i in x..y) {
            // 도달할 수 없는 숫자는 건너뜀
            if (dp[i] == INF) continue
            
            if (i + n <= y) {
                dp[i + n] = min(dp[i + n], dp[i] + 1)
            }
            
            if (i * 2 <= y) {
                dp[i * 2] = min(dp[i * 2], dp[i] + 1)
            }
            
            if (i * 3 <= y) {
                dp[i * 3] = min(dp[i * 3], dp[i] + 1)
            }
        }
        
        return if (dp[y] == INF) -1 else dp[y]
    }
}