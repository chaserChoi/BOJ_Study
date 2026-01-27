class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val len = p.length
        // p 길이 -> 최대 18 => Int 범위 넘어가서 Long 사용
        val targetNum = p.toLong()
        
        // 슬라이딩 윈도우
        for (i in 0 .. t.length - len) {
            // i ~ p 만큼 문자열 자르기
            val subString = t.substring(i, i + len)
            
            // 잘라낸 문자열 -> 숫자 변환
            if (subString.toLong() <= targetNum) {
                answer++
            }
        }
        
        return answer
    }
}