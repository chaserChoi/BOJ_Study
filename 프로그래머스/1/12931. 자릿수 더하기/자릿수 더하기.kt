class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var current = n
        
        // 숫자가 0보다 클 때까지 반복 
        while (current > 0) {
            answer += current % 10
            
            current /= 10
        }

        return answer
    }
}