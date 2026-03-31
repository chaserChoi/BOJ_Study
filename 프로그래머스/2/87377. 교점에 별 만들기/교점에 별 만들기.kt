class Solution {
    // 좌표 데이터 클래스 
    data class Point(val x: Long, val y: Long)
    
    fun solution(line: Array<IntArray>): Array<String> {
        val points = mutableListOf<Point>()
        
        var minX = Long.MAX_VALUE
        var maxX = Long.MIN_VALUE
        var minY = Long.MAX_VALUE
        var maxY = Long.MIN_VALUE
        
        for (i in 0 until line.size) {
            for (j in i + 1 until line.size) {
                val a = line[i][0].toLong()
                val b = line[i][1].toLong()
                val e = line[i][2].toLong()
                
                val c = line[j][0].toLong()
                val d = line[j][1].toLong()
                val f = line[j][2].toLong()
                
                // 분모 (ad - bc)
                val denominator = a * d - b * c
                if (denominator == 0L) continue
                
                // 분자 (x, y)
                val numeratorX = b * f - e * d
                val numeratorY = e * c - a * f
                
                // 정수 좌표인지 확인
                if (numeratorX % denominator == 0L && numeratorY % denominator == 0L) {
                    val x = numeratorX / denominator
                    val y = numeratorY / denominator
                    
                    points.add(Point(x, y))
                    
                    // 최대/최소 좌표 갱신
                    minX = minOf(minX, x)
                    maxX = maxOf(maxX, x)
                    minY = minOf(minY, y)
                    maxY = maxOf(maxY, y)
                }
            }
        }
        
        // 격차판 크기 
        val width = (maxX - minX + 1).toInt()
        val height = (maxY - minY + 1).toInt()
        
        // 초기 격자판 
        val board = Array(height) { CharArray(width) { '.' } }
        
        for (p in points) {
            val row = (maxY - p.y).toInt()
            val col = (p.x - minX).toInt()
            board[row][col] = '*'
        }
        
        return board.map { String(it) }.toTypedArray()
    }
}