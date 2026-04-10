class Solution {
    fun solution(n: Int): IntArray {
        val matrix = Array(n) { IntArray(it + 1) } // 삼각형 구조 담을 2차원 배열 
        
        var row = -1 // 처음 시작 시 아래로(+1) 이동 
        var col = 0
        var num = 1 // 배열에 채워넣을 숫자 
        
        for (i in 0 until n) {
            for (j in i until n) {
                when (i % 3) {
                    0 -> row++ // 아래로 
                    1 -> col++ // 오름쪽으로
                    2 -> { // 대각선 위로 
                        row--
                        col--
                    }
                }
                
                matrix[row][col] = num++
            }
        }
        
        // 삼각형 배열(2차원) -> 1차원 배열 변환 
        val totalSize = n * (n + 1) / 2
        val answer = IntArray(totalSize)
        var index = 0
        
        for (r in 0 until n) {
            for (c in 0..r) {
                answer[index++] = matrix[r][c]
            }
        }
        
        return answer
    }
}