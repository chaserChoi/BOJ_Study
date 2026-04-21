class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val totalArea = brown + yellow
        
        for (height in 3..totalArea) {
            // 전체 넓이(totalArea)가 세로 길이(height)로 나누어 떨어질 경우 => 직사각형 
            if (totalArea % height == 0) {
                val width = totalArea / height
                
                if (width < height) break // 가로 길이는 세로 길이보다 같거나 길어야 함 
                
                // 내부 노란색 격자 크기 일치하는 경우 
                if ((width - 2) * (height - 2) == yellow) {
                    return intArrayOf(width, height)
                }
            }
        }
        
        return intArrayOf()
    }
}