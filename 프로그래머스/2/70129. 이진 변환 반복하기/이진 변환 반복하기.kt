class Solution {
    fun solution(s: String): IntArray {
        var currentStr = s
        var transformCount = 0
        var removedZerosCount = 0
        
        // 문자열 "1" 될 때까지
        while (currentStr != "1") {
            val zeroCount = currentStr.count { it == '0' } // 현재 문자열에서 '0' 개수
            
            removedZerosCount += zeroCount // + 제거된 '0' 개수
            
            val newLength = currentStr.length - zeroCount // '0' 제거 후 길이
            
            currentStr = newLength.toString(2) // 길이 -> 2진수 문자열 
            
            transformCount++ // 이진 변환 회차++
        }
        
        return intArrayOf(transformCount, removedZerosCount)
    }
}