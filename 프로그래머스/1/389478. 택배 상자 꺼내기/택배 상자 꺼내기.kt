class Solution {
    fun solution(n: Int, w: Int, num: Int): Int {
        var answer: Int = 0
        
        val targetRow = (num - 1) / w // 행 인덱스
        val targetOffset = (num - 1) % w // 행 순서
        
        // 실제 열 위치 고정 (짝수: 좌 -> 우 / 홀수: 우 -> 좌)
        val fixedColIndex = if (targetRow % 2 == 0) {
            targetOffset
        } else {
            w - 1 - targetOffset
        }
        
        var currentRow = targetRow // 현재 층(targetRow)부터 위쪽으로 올라가며 같은 열에 상자 있는지 확인
        
        while (true) {
            val startNumOfRow = currentRow * w + 1 // 해당 층(currentRow) 시작 숫자
            
            // 해당 층에서 fixedColIndex 위치에 있는 상자 번호 
            val boxNumAtPos = if (currentRow % 2 == 0) {
                startNumOfRow + fixedColIndex // 짝수 층
            } else {
                startNumOfRow + (w - 1 - fixedColIndex) // 홀수 층
            }
            
            if (boxNumAtPos > n) break // 계산된 상자 번호 > 전체 개수 => 종료 
            
            answer++
            
            currentRow++
        }
        
        return answer
    }
}