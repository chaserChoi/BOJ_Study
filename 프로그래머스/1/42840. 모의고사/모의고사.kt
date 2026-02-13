class Solution {
    fun solution(answers: IntArray): IntArray {
        // 찍기 패턴
        val pattern1 = intArrayOf(1, 2, 3, 4, 5)
        val pattern2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val pattern3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        
        // 점수
        var score1 = 0
        var score2 = 0
        var score3 = 0
        
        // 정답 순회하며 채점 
        for (i in answers.indices) {
            // i % 배열 크기
            if (answers[i] == pattern1[i % pattern1.size]) score1++
            if (answers[i] == pattern2[i % pattern2.size]) score2++
            if (answers[i] == pattern3[i % pattern3.size]) score3++
        }
        
        // 가장 높은 점수
        val maxScore = maxOf(score1, score2, score3)
        
        // 최고 점수 받은 사람 추출 
        val result = mutableListOf<Int>()
        
        // 오름차순 정렬 (1번부터 차례대로 비교)
        if (score1 == maxScore) result.add(1)
        if (score2 == maxScore) result.add(2)
        if (score3 == maxScore) result.add(3)
        
        return result.toIntArray()
    }
}