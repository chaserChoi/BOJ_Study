class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        // 각 카드 뭉치의 현재 인덱스 포인터
        var idx1 = 0
        var idx2 = 0
        
        // goal 단어 순서대로 확인
        for (targetWord in goal) {
            // 카드 뭉치 1, 2의 현재 카드 = 목표 단어
            if (idx1 < cards1.size && cards1[idx1] == targetWord) {
                idx1++ // 일치 시, 다음 카드로 이동
            } else if (idx2 < cards2.size && cards2[idx2] == targetWord) {
                idx2++ 
            } else {
                return "No" // 둘 다 일치 X -> goal X
            }
        }
        
        return "Yes"
    }
}