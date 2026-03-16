class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = IntArray(numbers.size) { -1 }
        
        // 아직 뒷 큰수를 찾지 못한 윈소의 index 담을 스택 
        val stack = ArrayDeque<Int>()
        
        for (i in numbers.indices) {
            // 스택 not empty & 현재 숫자 > 스택 맨 위 인덱스 숫자 
            while (stack.isNotEmpty() && numbers[stack.last()] < numbers[i]) {
                val index = stack.removeLast() // 뒷 큰수 찾은 인덱스를 스택에서 제거 
                answer[index] = numbers[i] // 해당 위치에 뒤 큰수 추가 
            }
            
            // 현재 인덱스를 스택에 넣어 다음 뒷 큰수 대기 
            stack.addLast(i)
        }
        
        return answer
    }
}