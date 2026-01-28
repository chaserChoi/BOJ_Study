class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        
        var x: Char? = null
        
        var countX = 0 // x와 같은 글자 수
        var countOther = 0 // x와 다른 글자 수
        
        for (c in s) {
            // 새로운 문자열 분리 
            if (x == null) {
                x = c
                countX = 1
                answer++
            } else { // 기존 문자열 계속 읽는 경우
                if (x == c) {
                    countX++
                } else {
                    countOther++
                }
                
                // 두 횟수 같아지면 
                if (countX == countOther) {
                    x = null
                    countX = 0
                    countOther = 0
                }
            }
        }
        
        return answer
    }
}