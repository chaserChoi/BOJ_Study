import kotlin.math.sqrt

class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        
        val baseKString = n.toString(k) // n -> k진수 문자열 
        
        // 0 기준으로 문자열 split & 연속된 0으로 생긴 빈 문자열 제거 
        val candidates = baseKString.split("0").filter { it.isNotEmpty() }
        
        // 수소 판별 
        for (candidate in candidates) {
            val num = candidate.toLong()
            
            if (isPrime(num)) {
                answer++
            }
        }
        
        return answer
    }
    
    private fun isPrime(num: Long): Boolean {
        if (num <= 1L) return false
        if (num == 2L) return true
        if (num % 2L == 0L) return false // 짝수 미리 제외
        
        val limit = sqrt(num.toDouble()).toLong() // 제곱근만 검사
        
        // 3부터 홀수만 검사 
        var i = 3L
        while (i <= limit) {
            if (num % i == 0L) {
                return false
            }
            i += 2L
        }
        
        return true
    }
}