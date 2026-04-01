import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        var minDiff = Int.MAX_VALUE
        
        // 송전탑 연결 상태 담은 양방향 인접 리스트 
        val adj = Array(n + 1) { mutableListOf<Int>() }
        for (wire in wires) {
            adj[wire[0]].add(wire[1])
            adj[wire[1]].add(wire[0])
        }
        
        // 모든 전선 하나씩 끊어보며 완전 탐색 
        for (wire in wires) {
            val u = wire[0]
            val v = wire[1]
            
            val visited = BooleanArray(n + 1)
            var count = 0
            
            // 한쪽 전력망의 송전탑 개수 dfs
            fun dfs(node: Int) {
                visited[node] = true
                count++
                
                for (next in adj[node]) {
                    // 끊기로 가정한 전선(u-v)
                    if ((node == u && next == v) || (node == v && next == u)) {
                        continue
                    }
                    
                    // 아직 방문 X
                    if (!visited[next]) {
                        dfs(next)
                    }
                }
            }
            
            dfs(u)
            
            val diff = abs(n - 2 * count) // 두 전력망 송전탑 개수 차이
            
            minDiff = min(minDiff, diff)
        }
    
        return minDiff
    }
}