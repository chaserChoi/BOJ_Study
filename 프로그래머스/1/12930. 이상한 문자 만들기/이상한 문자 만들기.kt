class Solution {
    fun solution(s: String): String {
        val sb = StringBuilder()
        var wordIndex = 0 // 단어별 인덱스 추적 변수
        
        for (char in s) {
            if (char == ' ') {
                sb.append(char)
                wordIndex = 0
            } else {
                if (wordIndex % 2 == 0) {
                    sb.append(char.uppercaseChar())
                } else {
                    sb.append(char.lowercaseChar())
                }
                wordIndex++ // 단어 내 인덱스 증가
            }
        }
        
        return sb.toString()
    }
}