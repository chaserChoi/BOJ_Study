import java.util.ArrayDeque

class Solution {
    fun solution(s: String): Int {
        val n = s.length
        
        if (n % 2 != 0) return 0 // 홀수 길이 -> 짝 무조건 X
        
        var answer = 0
        
        for (x in 0 until n) {
            if (isValid(s, x, n)) {
                answer++
            }
        }
        
        return answer
    }
    
    // 특정 회전 상태(offset)에서 올바른 괄로 문자열인지 검증
    private fun isValid(s: String, offset: Int, n: Int): Boolean {
        val stack = ArrayDeque<Char>()
        
        for (i in 0 until n) {
            val char = s[(i + offset) % n] // 모듈러 연산 
            
            when (char) {
                // 여는 괄호 -> 스택에 추가
                '(', '{', '[' -> stack.addLast(char)
                
                // 닫는 괄호 -> 짝이 맞는지 확인 
                ')' -> {
                    if (stack.isEmpty() || stack.removeLast() != '(') return false
                }
                '}' -> {
                    if (stack.isEmpty() || stack.removeLast() != '{') return false
                }
                ']' -> {
                    if (stack.isEmpty() || stack.removeLast() != '[') return false
                }
            }
        }
        
        return stack.isEmpty()
    }
}