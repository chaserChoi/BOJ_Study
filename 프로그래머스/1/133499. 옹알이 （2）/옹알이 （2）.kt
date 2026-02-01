class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        
        val patterns = arrayOf("aya", "ye", "woo", "ma") // 발음할 수 있는 기본 발음들
        val repeats = arrayOf("ayaaya", "yeye", "woowoo", "mama") // 연속 발음 X
        
        for (word in babbling) {
            // 연속된 발음 포함 -> 건너뜀 
            var isInvalid = false
            for (repeat in repeats) {
                if (word.contains(repeat)) {
                    isInvalid = true
                    break
                }
            }
            if (isInvalid) continue
            
            // 가능한 발음 -> " "(공백) 치환 
            var temp = word
            for (pattern in patterns) {
                temp = temp.replace(pattern, " ")
            }
            
            if (temp.trim().isEmpty()) {
                answer++
            }
        }
        
        return answer
    }
}