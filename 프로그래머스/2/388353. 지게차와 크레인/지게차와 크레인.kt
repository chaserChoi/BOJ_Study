class Solution {
    fun solution(storage: Array<String>, requests: Array<String>): Int {
        val n = storage.size
        val m = storage[0].length
        
        // 외곽에 한 칸식 패딩 두른 (n+2)x(m+2) 크기 창고 
        val grid = Array(n + 2) { CharArray(m + 2) { ' ' } }
        
        // 페딩 안쪽 정중앙 -> 실제 컨테이너 정보 배치 
        for (i in 0 until n) {
            for (j in 0 until m) {
                grid[i + 1][j + 1] = storage[i][j]
            }
        }
        
        val dr = intArrayOf(-1, 1, 0, 0)
        val dc = intArrayOf(0, 0, -1, 1)
        
        // 요청 처리 
        for (req in requests) {
            val target = req[0] // 찾을 컨테이너 종류
            
            // 크레인 
            if (req.length == 2) {
                // 외부 연결 상관없이 모든 target 제거 
                for (i in 1..n) {
                    for (j in 1..m) {
                        if (grid[i][j] == target) {
                            grid[i][j] = ' '
                        }
                    }
                }
            // 지게차 
            } else {
                // 외부와 연결된 target만 제거 
                val visited = Array(n + 2) { BooleanArray(m + 2) }
                val q = ArrayDeque<Pair<Int, Int>>()
                val toRemove = mutableListOf<Pair<Int, Int>>()
                
                q.add(0 to 0)
                visited[0][0] = true
                
                // 외부 공기(빈 공간) 타고 흐르는 bfs
                while (q.isNotEmpty()) {
                    val (r, c) = q.removeFirst()
                    
                    for (d in 0..3) {
                        val nr = r + dr[d]
                        val nc = c + dc[d]
                        
                        // 창고 배열 범위 벗어나지 않고, 아직 방문 X
                        if (nr in 0..n + 1 && nc in 0..m + 1 && !visited[nr][nc]) {
                            if (grid[nr][nc] == ' ') {
                                visited[nr][nc] = true
                                q.add(nr to nc)
                            } else if (grid[nr][nc] == target) {
                                visited[nr][nc] = true
                                toRemove.add(nr to nc)
                            }
                        }
                    }
                }
                
                // 모아둔 컨테이너 일괄 제거 
                for ((r, c) in toRemove) {
                    grid[r][c] = ' '
                }
            }
        }
        
        // 남아 있는 컨테이너 개수 
        var answer = 0
        for (i in 1..n) {
            for (j in 1..m) {
                if (grid[i][j] != ' ') {
                    answer++
                }
            }
        }
        
        return answer
    }
}