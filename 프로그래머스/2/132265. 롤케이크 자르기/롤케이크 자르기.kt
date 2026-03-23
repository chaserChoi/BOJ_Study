class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        
        val rightCount = IntArray(10001)
        val leftCount = IntArray(10001)
        
        var rightTypes = 0
        var leftTypes = 0
        
        // 동생(오른쪽) 세팅 
        for (t in topping) {
            // 처음보는 토핑이라면 
            if (rightCount[t] == 0) {
                rightTypes++
            }
            rightCount[t]++
        }
        
        // 철수(왼쪽) 앞부터 하나씩 케이크 가져옴 
        for (t in topping) {
            // 철수 토핑 획득 
            if (leftCount[t] == 0) {
                leftTypes++
            }
            leftCount[t]++
            
            // 동생 토핑 상싷 
            rightCount[t]--
            if (rightCount[t] == 0) {
                rightTypes--
            }
            
            // 두 사람 토핑 가짓수 동일하다면 
            if (leftTypes == rightTypes) {
                answer++
            }
        }
        
        return answer
    }
}