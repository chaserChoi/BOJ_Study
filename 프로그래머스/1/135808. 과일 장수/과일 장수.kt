class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        
        // 점수 배열 -> 오름차순 정렬 
        score.sort()
        
        // 뒤에서부터(큰 값부터) m개씩 묶어서 상자 제작 
        for (i in score.size - m downTo 0 step m) {
            answer += score[i] * m
        }
        
        return answer
    }
}