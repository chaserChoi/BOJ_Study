import kotlin.math.sqrt

class Solution {
    fun solution(k: Int, d: Int): Long {
        var answer: Long = 0
        
        // 반복 횟수: x좌표에 들어갈 수 있는 k 배수 개수
        val limit = d / k
        val dLong = d.toLong()
        val kLong = k.toLong()
        
        for (a in 0..limit) {
            val x = a.toLong() * kLong // 현재 x 좌표 
            
            // 현재 x 위치에서 가능한 최대 y 거리 계산 
            val maxY = sqrt((dLong * dLong - x * x).toDouble()).toLong()
            
            // maxY 거리 안에 들어가는 k 배수 개수 + 1
            answer += (maxY / kLong) + 1
        }
        
        return answer
    }
}