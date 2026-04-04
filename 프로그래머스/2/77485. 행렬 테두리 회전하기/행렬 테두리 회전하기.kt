import kotlin.math.min

class Solution {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        val answer = IntArray(queries.size)
        
        val matrix = Array(rows) { r -> 
            IntArray(columns) { c -> r * columns + c + 1 }
        }
        
        for (i in queries.indices) {
            val r1 = queries[i][0] - 1
            val c1 = queries[i][1] - 1
            val r2 = queries[i][2] - 1
            val c2 = queries[i][3] - 1
            
            val temp = matrix[r1][c1] // 가장 왼쪽 위 값 백업 
            var minVal = temp
            
            // 반시계 방향으로 값 한 칸씩 당겨오기 
            for (r in r1 until r2) { // 왼쪽 테두리 
                matrix[r][c1] = matrix[r + 1][c1]
                minVal = min(minVal, matrix[r][c1])
            }
            
            for (c in c1 until c2) { // 아래쪽 테두리 
                matrix[r2][c] = matrix[r2][c + 1]
                minVal = min(minVal, matrix[r2][c])
            }
            
            for (r in r2 downTo r1 + 1) { // 오른쪽 테두리 
                matrix[r][c2] = matrix[r - 1][c2]
                minVal = min(minVal, matrix[r][c2])
            }
            
            for (c in c2 downTo c1 + 2) { // 위쪽 테두리 
                matrix[r1][c] = matrix[r1][c - 1]
                minVal = min(minVal, matrix[r1][c])
            }
            
            matrix[r1][c1 + 1] = temp // 백업해둔 값 제자리 삽입 
            
            answer[i] = minVal
        }
        
        return answer
    }
}