class Solution {
    fun solution(number: String, k: Int): String {
        var answer = StringBuilder()
        var removeCount = k
        
        for (i in 0 until number.length) {
            val current = number[i]
            
            // 스택에 숫자 있고, 아직 지울 기회가 남았다면,
            while (answer.isNotEmpty() && removeCount > 0 && answer.last() < current) {
                answer.deleteCharAt(answer.length - 1) // = pop()
                removeCount--
            }
            
            answer.append(current) // = push()
        }
        
        // 지워야 할 횟수(removeCount) 남은 경우 -> 남은 횟수 만큼 뒤에서부터 잘라냄 
        return answer.substring(0, answer.length - removeCount)
    }
}