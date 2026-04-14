class Solution {
    fun solution(p: String): String {
        if (p.isEmpty()) return "" // 1
        
        // 2
        var balance = 0
        var splitIndex = 0
        
        for (i in p.indices) {
            if (p[i] == '(') balance++
            else balance--
            
            // (,) 개수 같아지는 최초의 순간 
            if (balance == 0) {
                splitIndex = i + 1
                break
            }
        }
        
        val u = p.substring(0, splitIndex)
        val v = p.substring(splitIndex)
        
        // 3
        if (isCorrect(u)) { // 3-1
            return u + solution(v)
        } else { // 4
            val sb = StringBuilder()
            
            sb.append('(') // 4-1
            sb.append(solution(v)) // 4-2
            sb.append(')') // 4-3
            
            // 4-4
            val uTrimmed = u.substring(1, u.length - 1)
            for (char in uTrimmed) {
                if (char == '(') sb.append(')')
                else sb.append('(')
            }
            
            // 4-5
            return sb.toString()
        }
    }
    
    // "올바른 괄호 문자열" 확인 fn 
    private fun isCorrect(s: String): Boolean {
        var count = 0
        for (char in s) {
            if (char == '(') {
                count++
            } else { // 닫는 괄호가 나왔지만 짝 맞출 열린 괄호 없는 경우 
                if (count == 0) return false
                count--
            }
        }
        return count == 0
    }
}