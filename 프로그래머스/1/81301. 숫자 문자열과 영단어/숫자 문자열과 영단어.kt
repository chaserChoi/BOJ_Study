class Solution {
    fun solution(s: String): Int {
        val numberWords = arrayOf(
            "zero", "one", "two", "three", "four", 
            "five", "six", "seven", "eight", "nine"
        )
        
        var result = s
        
        // 문자열 치환 수행 
        for (i in numberWords.indices) {
            // 영단어 -> 숫자 변환 
            result = result.replace(numberWords[i], i.toString())
        }
        
        return result.toInt()
    }
}