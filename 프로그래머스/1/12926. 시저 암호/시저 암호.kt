class Solution {
    fun solution(s: String, n: Int): String {
        // 문자열(string) -> 문자(char) 변환(map) -> 문자열(joinToString())
        return s.map { char -> 
            when {
                // 소문자인 경우
                char.isLowerCase() -> {
                    val shifted = (char - 'a' + n) % 26
                    ('a' + shifted).toChar()
                }
                // 대문자인 경우 
                char.isUpperCase() -> {
                    val shifted = (char - 'A' + n) % 26
                    ('A' + shifted).toChar()
                }
                // 공백인 경우 
                else -> char
            }
        }.joinToString("")
    }
}