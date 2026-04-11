import kotlin.math.abs
import kotlin.math.max

class Solution {
    fun solution(expression: String): Long {
        // 정규식 + filter 사용 -> 숫자 & 연산자 분리 
        val numbers = expression.split(Regex("[+\\-*]")).map { it.toLong() }
        val ops = expression.filter { !it.isDigit() }.toList()
        
        // 3가지 연산자로 만들 수 있는 우선순위 조합 
        val priorities = listOf(
            listOf('+', '-', '*'),
            listOf('+', '*', '-'),
            listOf('-', '+', '*'),
            listOf('-', '*', '+'),
            listOf('*', '+', '-'),
            listOf('*', '-', '+')
        )
        
        var maxResult = 0L
        
        // 6가지 우선순위 모두 시뮬레이션 
        for (priority in priorities) {
            val tempNumbers = numbers.toMutableList()
            val tempOps = ops.toMutableList()
            
            // 현재 우선순위 조합에 따라 연산 진행 
            for (op in priority) {
                var i = 0
                while (i < tempOps.size) {
                    if (tempOps[i] == op) { // 현재 처리해야 할 우선순위 연산자 만났을 경우 
                        val res = calculate(tempNumbers[i], tempNumbers[i + 1], op)
                        
                        tempNumbers[i] = res
                        tempNumbers.removeAt(i + 1)
                        tempOps.removeAt(i)
                    } else { // 다른 연산자인 경우 -> pass
                        i++
                    }
                }
            }
            
            maxResult = max(maxResult, abs(tempNumbers[0]))
        }
        
        return maxResult
    }
    
    // 사칙연산 수행 fn
    private fun calculate(n1: Long, n2: Long, op: Char): Long {
        return when (op) {
            '+' -> n1 + n2
            '-' -> n1 - n2
            '*' -> n1 * n2
            else -> 0L
        }
    }
}