import kotlin.math.min

class Solution {
    fun solution(m: Int, n: Int, startX: Int, startY: Int, balls: Array<IntArray>): IntArray {
        val answer = IntArray(balls.size)
        
        for (i in balls.indices) {
            val targetX = balls[i][0]
            val targetY = balls[i][1]
            
            var minDistanceSq = Int.MAX_VALUE
            
            // 위쪽 벽(y = n)에 맞추는 경우 
            if (!(startX == targetX && startY < targetY)) {
                val distSq = getDistanceSq(startX, startY, targetX, 2 * n - targetY)
                minDistanceSq = min(minDistanceSq, distSq)
            }
            
            // 아래쪽 벽(y = 0)에 맞추는 경우 
            if (!(startX == targetX && startY > targetY)) {
                val distSq = getDistanceSq(startX, startY, targetX, -targetY)
                minDistanceSq = min(minDistanceSq, distSq)
            }
            
            // 완쪽 벽(x = 0)에 맞추는 경우 
            if (!(startY == targetY && startX > targetX)) {
                val distSq = getDistanceSq(startX, startY, -targetX, targetY)
                minDistanceSq = min(minDistanceSq, distSq)
            }
            
            // 오른쪽 벽(x = m)에 맞추는 경우 
            if (!(startY == targetY && startX < targetX)) {
                val distSq = getDistanceSq(startX, startY, 2 * m - targetX, targetY)
                minDistanceSq = min(minDistanceSq, distSq)
            }
            
            answer[i] = minDistanceSq
        }
        
        return answer
    }
    
    // 두 점 (x1, y1) & (x2, y2) 사이 거리의 제곱
    private fun getDistanceSq(x1: Int, y1: Int, x2: Int, y2: Int): Int {
        val dx = x1 - x2
        val dy = y1 - y2
        return dx * dx + dy * dy
    }
}