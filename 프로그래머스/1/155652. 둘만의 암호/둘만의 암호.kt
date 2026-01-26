class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        // skip에 포함되지 않은 알파벳만 필터링하여 리스트 생성
        val skipSet = skip.toSet() 
        val validAlphabet = ('a'..'z').filter { it !in skipSet }
        
        // s -> 각 문자 변환
        val answer = s.map { c -> 
            // 현재 문자가 유효 알파벳 리스트에서 몇 번째인지 찾기
            val currentIdx = validAlphabet.indexOf(c)
            
            // index만큼 뒤로 이동
            val newIdx = (currentIdx + index) % validAlphabet.size
            
            // 문자 반환
            validAlphabet[newIdx]
        }.joinToString("")
        
        return answer
    }
}