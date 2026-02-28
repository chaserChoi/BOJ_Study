import kotlin.math.min

class Solution {
    fun solution(players: IntArray, m: Int, k: Int): Int {
        var answer: Int = 0
        
        val runningServers = IntArray(24) { 0 } // 시간대별 가동 중인 서버 수 
        
        for (i in 0 until 24) {
            val required = players[i] / m // 해당 시간대에 필요한 최소 서버 수 
            
            if (required > runningServers[i]) { // 필요한 서버가 현재 가동 중이 서버보다 많다면 
                val addCount = required - runningServers[i]
                answer += addCount
                
                val endTime = min(24, i + k)
                for (j in i until endTime) {
                    runningServers[j] += addCount
                }
            }
        }
        
        return answer
    }
}