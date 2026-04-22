import kotlin.math.sqrt

class Solution {
    fun solution(numbers: String): Int {
        val uniqueNums = HashSet<Int>() // 중복 제거
        val visited = BooleanArray(numbers.length) // 각 자리 숫자 사용 여부 체크
        
        fun dfs(currentStr: String) {
            // 현재 만들어진 문자열 비어있지 않다면 
            if (currentStr.isNotEmpty()) {
                uniqueNums.add(currentStr.toInt()) // "011" -> 11
            }
            
            for (i in numbers.indices) {
                if (!visited[i]) {
                    visited[i] = true // 사용 처리
                    dfs(currentStr + numbers[i]) // 다음 재귀
                    visited[i] = false // 복구 (백트래킹)
                }
            }
        }
        
        dfs("")
        
        return uniqueNums.count { isPrime(it) }
    }
    
    private fun isPrime(n: Int): Boolean {
        // 0 & 1 
        if (n < 2) return false
        
        val limit = sqrt(n.toDouble()).toInt()
        for (i in 2..limit) {
            if (n % i == 0) return false
        }
        return true
    }
}