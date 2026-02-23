import kotlin.math.sqrt

class Solution {
    fun solution(n: Int): Int {
        if (n == 0) return 0
        
        var sum = 0
        val limit = sqrt(n.toDouble()).toInt() 
        
        for (i in 1..limit) {
            if (n % i == 0) { // 나누어 떨어지면 -> 약수 
                sum += i
                
                if (i != n / i) { // i의 짝이 되는 약수(n / i)
                    sum += n / i
                }
            }
        }
        
        return sum
    }
}