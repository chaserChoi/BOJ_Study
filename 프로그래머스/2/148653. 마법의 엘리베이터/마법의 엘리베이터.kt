class Solution {
    fun solution(storey: Int): Int {
        var answer: Int = 0
        var current = storey
        
        while (current > 0) {
            val remainder = current % 10 // 현재 자릿수 숫자
            val nextDigit = (current / 10) % 10 // 다음 자릿수 숫자
            
            when {
                remainder > 5 -> { // 현재 숫자 > 5
                    answer += (10 - remainder)
                    current += 10
                }
                remainder == 5 -> { // 현재 숫자 = 5
                    answer += 5
                    if (nextDigit >= 5) {
                        current += 10
                    }
                }
                else -> { // 현재 숫자 < 5
                    answer += remainder
                }
            }
            
            current /= 10
        }
                
        return answer
    }
}