import kotlin.math.min

class Solution {
    fun solution(s: String): Int {
        if (s.length == 1) return 1 // 문자열 길이 = 1 -> 자를 수 X
        
        var minLength = s.length
        
        for (step in 1..s.length / 2) {
            val compressed = StringBuilder()
            var prev = s.substring(0, step)
            var count = 1
            
            // step만큼 건너뛰면서 문자열 비교 
            for (j in step until s.length step step) {
                val endIdx = min(j + step, s.length)
                val curr = s.substring(j, endIdx)
                
                if (prev == curr) { // 이전 문자열과 같다면 
                    count++
                } else { // 이전 문자열과 다르다면 
                    if (count > 1) {
                        compressed.append(count)
                    }
                    compressed.append(prev)
                    
                    prev = curr // 기준 문자열 -> 현재 문자열 변경 & count 초기화 
                    count = 1
                }
            }
            
            if (count > 1) {
                compressed.append(count)
            }
            compressed.append(prev)
            
            minLength = min(minLength, compressed.length)
        }
        
        return minLength
    }
}