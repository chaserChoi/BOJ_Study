class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var h = park.size // 세로
        var w = park[0].length // 가로
        
        var curRow = 0
        var curCol = 0
        
        // 시작 지점(S) 
        for (i in park.indices) {
            val idx = park[i].indexOf('S')
            if (idx != -1) {
                curRow = i
                curCol = idx
                break
            }
        }
        
        // 시뮬레이션
        for (route in routes) {
            val split = route.split(" ")
            val op = split[0] // 방향 (N, S, W, E)
            val n = split[1].toInt() // 거리
            
            // 방향에 따른 변화량
            // N = 상(-1), S = 하(+1), W = 좌(-1), E = 우(+1)
            val (dr, dc) = when (op) {
                "N" -> -1 to 0
                "S" -> 1 to 0
                "W" -> 0 to -1
                "E" -> 0 to 1
                else -> 0 to 0
            }
            
            // 이동 가능성
            var tempRow = curRow
            var tempCol = curCol
            var isPossible = true
            
            // 한 칸씩 이동
            for (step in 1..n) {
                tempRow += dr
                tempCol += dc
                
                // 공원 벗어나는지 확인
                if (tempRow !in 0 until h || tempCol !in 0 until w) {
                    isPossible = false
                    break
                }
                
                // 장애물('X') 있는지 확인
                if (park[tempRow][tempCol] == 'X') {
                    isPossible = false
                    break
                }
            }
            
            // 실제 위치 업데이트
            if (isPossible) {
                curRow = tempRow
                curCol = tempCol
            }
        }
        
        return intArrayOf(curRow, curCol)
    }
}