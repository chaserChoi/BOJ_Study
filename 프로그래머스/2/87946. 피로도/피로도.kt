import kotlin.math.max

class Solution {
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        var maxDungeons = 0
        val visited = BooleanArray(dungeons.size)
        
        // 모든 탐험 순서(경로) 확인 (dfs)
        fun dfs(currentK: Int, count: Int) {
            maxDungeons = max(maxDungeons, count) 
            
            for (i in dungeons.indices) {
                val minRequired = dungeons[i][0]
                val cost = dungeons[i][1]
                
                if (!visited[i] && currentK >= minRequired) {
                    visited[i] = true // 던전 입장 -> 방문 처리
                    dfs(currentK - cost, count + 1) // 피로도 소모 및 카운트 중가
                    visited[i] = false // 탐색 후 백트래킹
                }
            }
        }
        
        dfs(k, 0)
        
        return maxDungeons
    }
}