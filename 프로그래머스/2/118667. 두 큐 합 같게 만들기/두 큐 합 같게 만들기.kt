class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val q1 = ArrayDeque<Int>()
        val q2 = ArrayDeque<Int>()
        
        var sum1 = 0L
        var sum2 = 0L
        
        for (i in queue1.indices) {
            q1.addLast(queue1[i])
            sum1 += queue1[i]
            
            q2.addLast(queue2[i])
            sum2 += queue2[i]
        }
        
        val totalSum = sum1 + sum2
        
        // 총합 홀수 -> 반으로 나눌 수 X
        if (totalSum % 2L != 0L) {
            return -1
        }
        
        val target = totalSum / 2L
        
        val maxOperations = queue1.size * 4 // 최대 작업 횟수
        var operations = 0
        
        while (operations <= maxOperations) {
            // 두 큐의 합 -> 목표치 도달
            if (sum1 == target) {
                return operations
            }
            
            if (sum1 > target) {
                val value = q1.removeFirst()
                sum1 -= value
                q2.addLast(value)
                sum2 += value
            } else {
                val value = q2.removeFirst()
                sum2 -= value
                q1.addLast(value)
                sum1 += value
            }
            
            operations++
        }
        
        return -1
    }
}