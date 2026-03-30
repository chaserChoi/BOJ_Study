import kotlin.math.max

class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val size = (right - left + 1).toInt()
        val answer = IntArray(size)
        
        for (i in 0 until size) {
            val index = left + i // 현재 구해야 하는 1차원 배열 인덱스 
            
            // 1차원 인덱스 -> 2차원 배열 row, col 좌표 역산 
            val row = (index / n).toInt()
            val col = (index % n).toInt()
            
            answer[i] = max(row, col) + 1
        }
        
        return answer
    }
}