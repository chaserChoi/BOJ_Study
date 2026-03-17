class Solution {
    fun solution(weights: IntArray): Long {
        var answer: Long = 0L
        
        // 몸무게 빈도수 
        val counts = LongArray(1001)
        for (w in weights) {
            counts[w]++
        }
        
        // 짝꿍 찾기 
        for (i in 100..1000) {
            val currentCount = counts[i]
            
            if (currentCount > 0) {
                // 몸무게 완전히 같은 경우 
                answer += currentCount * (currentCount - 1) / 2
                
                // 2:3 비율 
                if (i % 2 == 0 && i * 3 / 2 <= 1000) {
                    answer += currentCount * counts[i * 3 / 2]
                }
                
                // 3:4 비율 
                if (i % 3 == 0 && i * 4 / 3 <= 1000) {
                    answer += currentCount * counts[i * 4 / 3]
                }
                
                // 1:2 비율 
                if (i * 2 <= 1000) {
                    answer += currentCount * counts[i * 2]
                }
            }
        }
        
        return answer
    }
}