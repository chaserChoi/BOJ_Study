class Solution {
    fun solution(new_id: String): String {
        var answer: String = new_id.lowercase() // 1단계
        
        answer = answer.replace(Regex("[^a-z0-9\\-_.]"), "") // 2단계 
        
        answer = answer.replace(Regex("\\.{2,}"), ".") // 3단계
        
        answer = answer.replace(Regex("^\\.|\\.$"), "") // 4단계 
        
        // 5단계 
        if (answer.isEmpty()) {
            answer = "a"
        }
        
        // 6단계 
        if (answer.length >= 16) {
            answer = answer.take(15)
            answer = answer.removeSuffix(".")
        }
        
        // 7단계 
        while (answer.length <= 2) {
            answer += answer.last()
        }
        
        return answer
    }
}