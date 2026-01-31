class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        
        val stack = IntArray(ingredient.size) // 배열을 스택으로 사용
        var sp = 0 // 스택 포인터
        
        for (item in ingredient) {
            stack[sp] = item
            sp++
            
            if (sp >= 4 && 
                    stack[sp - 1] == 1 && // 빵 (top)
                    stack[sp - 2] == 3 && // 고기
                    stack[sp - 3] == 2 && // 야채
                    stack[sp - 4] == 1 // 빵 (bottom)
               ) {
                answer++
                
                sp -= 4
            }
        }
        
        return answer
    }
}