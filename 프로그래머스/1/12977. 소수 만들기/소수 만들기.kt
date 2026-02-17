import kotlin.math.sqrt

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val n = nums.size
 
        // 서로 다른 3개 숫자 고르는 모든 조합 탐색
        for (i in 0 until n - 2) {
            for (j in i + 1 until n - 1) {
                for (k in j + 1 until n) {
                    val sum = nums[i] + nums[j] + nums[k]
                    
                    // 합이 소수인지 판별하여 맞으면 count++
                    if (isPrime(sum)) {
                        answer++
                    }
                }
            }
        }

        return answer
    }
    
    // 소수 판별 함수
    private fun isPrime(num: Int): Boolean {
        if (num < 2) return false // 0 & 1 -> 소수 X
        
        val limit = sqrt(num.toDouble()).toInt()
        for (i in 2..limit) {
            if (num % i == 0) { // 나누어 떨어지면
                return false
            }
        }
        
        return true
    }
}