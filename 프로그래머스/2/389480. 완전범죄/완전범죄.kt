import kotlin.math.min

class Solution {
    fun solution(info: Array<IntArray>, n: Int, m: Int): Int {
        val INF = 1_000_000
        
        // B 흔적 누적이 j일 때, A 최소 흔적
        var dp = IntArray(m) { INF }
        dp[0] = 0 // 초기 상태 
        
        for (item in info) {
            val traceA = item[0]
            val traceB = item[1]
            
            val nextDp = IntArray(m) { INF } // 현재 물건 훔친 후의 상태 임시 저장 
            
            for (j in 0 until m) {
                if (dp[j] == INF) continue // 도달할 수 없는 상태 
                
                nextDp[j] = min(nextDp[j], dp[j] + traceA) // A도둑이 훔치는 경우 
                
                if (j + traceB < m) { // B도둑이 훔치는 경우 
                    nextDp[j + traceB] = min(nextDp[j + traceB], dp[j])
                }
            }
            
            dp = nextDp
        }
        
        var minA = INF
        for (j in 0 until m) {
            if (dp[j] < n) {
                minA = min(minA, dp[j])
            }
        }
        
        return if (minA == INF) -1 else minA
    }
}