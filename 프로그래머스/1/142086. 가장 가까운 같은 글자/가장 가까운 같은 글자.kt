class Solution {
    fun solution(s: String): IntArray {
        val lastSeenMap = mutableMapOf<Char, Int>()
        
        return IntArray(s.length) { i -> 
            val char = s[i]
            
            val result = if (lastSeenMap.containsKey(char)) {
                // 이전에 등장한 적이 있다면
                i - lastSeenMap[char]!!
            } else {
                // 처음 등장 시,
                -1
            }
            
            // 현재 문자의 위치 -> 최신 인덱스 갱신
            lastSeenMap[char] = i
            
            result
        }
    }
}