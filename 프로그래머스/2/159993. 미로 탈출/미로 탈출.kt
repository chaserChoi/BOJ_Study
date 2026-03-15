class Solution {
    // 큐에 담을 좌표 및 거리 
    data class Point(val r: Int, val c: Int, val dist: Int)
    
    fun solution(maps: Array<String>): Int {
        val n = maps.size
        val m = maps[0].length
        
        var start: Point? = null
        var lever: Point? = null
        
        // 시작점(S) & 레버(L) 위치 
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (maps[i][j] == 'S') start = Point(i, j, 0)
                if (maps[i][j] == 'L') lever = Point(i, j, 0)
            }
        }
        
        // bfs
        fun bfs(startPoint: Point, target: Char): Int {
            val q = ArrayDeque<Point>()
            val visited = Array(n) { BooleanArray(m) }
            
            val dr = intArrayOf(-1, 1, 0, 0)
            val dc = intArrayOf(0, 0, -1, 1)
            
            q.add(startPoint)
            visited[startPoint.r][startPoint.c] = true
            
            while (q.isNotEmpty()) {
                val curr = q.removeFirst()
                
                if (maps[curr.r][curr.c] == target) {
                    return curr.dist
                }
                
                for (d in 0..3) {
                    val nr = curr.r + dr[d]
                    val nc = curr.c + dc[d]
                    
                    if (nr in 0 until n && nc in 0 until m && maps[nr][nc] != 'X' && !visited[nr][nc]) {
                        visited[nr][nc] = true
                        q.add(Point(nr, nc, curr.dist + 1))
                    }
                }
            }
            
            return -1
        }
        
        // 시작점 -> 레버 최단 거리 
        val toLever = bfs(start!!, 'L')
        if (toLever == -1) return -1
        
        // 레버 -> 출구 최단 거리 
        val toExit = bfs(Point(lever!!.r, lever!!.c, 0), 'E')
        if (toExit == -1) return -1
        
        return toLever + toExit
    }
}