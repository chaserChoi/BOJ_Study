class Solution {
    fun solution(maps: Array<String>): IntArray {
        val n = maps.size
        val m = maps[0].length
        val visited = Array(n) { BooleanArray(m) }
        var answer = mutableListOf<Int>()
        
        val dr = intArrayOf(-1, 1, 0, 0)
        val dc = intArrayOf(0, 0, -1, 1)
        
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (maps[i][j] != 'X' && !visited[i][j]) {
                    var sum = 0
                    val q = ArrayDeque<Pair<Int, Int>>()
                    
                    // bfs
                    q.add(Pair(i, j))
                    visited[i][j] = true
                    
                    while (q.isNotEmpty()) {
                        val (r, c) = q.removeFirst()
                        // Char -> Int 변환 후 누적 
                        sum += maps[r][c] - '0'
                        
                        // 인접 땅 탐색 
                        for (d in 0..3) {
                            val nr = r + dr[d]
                            val nc = c + dc[d]
                            
                            // 지도 범위 벗어나지 않음 & 바다 X & 방문하지 않는 경우 
                            if (nr in 0 until n && nc in 0 until m && maps[nr][nc] != 'X' && !visited[nr][nc]) {
                                visited[nr][nc] = true
                                q.add(Pair(nr, nc))
                            }
                        }
                    }
                    
                    // 탐색 끝난 무인도 식량 총합 
                    answer.add(sum)
                }
            }
        }
        
        // 무인도 하나도 없는 경우 => [-1]
        if (answer.isEmpty()) {
            return intArrayOf(-1)
        }
        
        return answer.sorted().toIntArray()
    }
}