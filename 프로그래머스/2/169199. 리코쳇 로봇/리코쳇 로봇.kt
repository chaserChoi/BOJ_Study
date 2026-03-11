class Solution {
    // 큐에 넣을 위치 & 이동 횟수 정보 
    data class Point(val r: Int, val c: Int, val dist: Int)
    
    fun solution(board: Array<String>): Int {
        val n = board.size
        val m = board[0].length
        
        var startR = 0
        var startC = 0
        
        // 시작 위치(R) 찾기 
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (board[i][j] == 'R') {
                    startR = i
                    startC = j
                }
            }
        }
        
        val dr = intArrayOf(-1, 1, 0, 0)
        val dc = intArrayOf(0, 0, -1, 1)
        
        val q = ArrayDeque<Point>()
        val visited = Array(n) { BooleanArray(m) }
        
        q.add(Point(startR, startC, 0))
        visited[startR][startC] = true
        
        // bfs
        while (q.isNotEmpty()) {
            val curr = q.removeFirst()
            
            // 목표 지점(G) 도착 
            if (board[curr.r][curr.c] == 'G') {
                return curr.dist
            }
            
            // 4방향 미끄러지기 
            for (d in 0..3) {
                var nr = curr.r
                var nc = curr.c
                
                // 장애물 및 벽 부딪힐 때까지 현재 방향(d)으로 이동
                while (true) {
                    val nextR = nr + dr[d]
                    val nextC = nc + dc[d]
                    
                    // 다음 칸이 범위 벗어나거나 장애물(D)이라면 -> 이동 중지 
                    if (nextR !in 0 until n || nextC !in 0 until m || board[nextR][nextC] == 'D') {
                        break
                    }
                    
                    nr = nextR
                    nc = nextC
                }
                
                // 미끄러짐 멈춘 최종 위치가 아직 방문하지 않은 곳이라면 
                if (!visited[nr][nc]) {
                    visited[nr][nc] = true
                    q.add(Point(nr, nc, curr.dist + 1))
                }
            }
        }
        
        return -1
    }
}