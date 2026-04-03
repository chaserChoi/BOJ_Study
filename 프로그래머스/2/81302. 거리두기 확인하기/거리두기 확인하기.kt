import java.util.ArrayDeque

class Solution {
    // 방향 배열 
    private val dr = intArrayOf(-1, 1, 0, 0)
    private val dc = intArrayOf(0, 0, -1, 1)
    
    fun solution(places: Array<Array<String>>): IntArray {
        var answer = IntArray(places.size)
        
        for (i in places.indices) {
            if (checkRoom(places[i])) {
                answer[i] = 1 // 거리두기 O
            } else {
                answer[i] = 0 // 거리두기 위반
            }
        }
        
        return answer
    }
    
    // 하나의 대기실에 대한 거리두기 준수 여부 
    private fun checkRoom(room: Array<String>): Boolean {
        for (r in 0 until 5) {
            for (c in 0 until 5) {
                if (room[r][c] == 'P') { // 응시자가 앉은 자리(P) 찾으면, 
                    if (!bfs(room, r, c)) { // 한 명이라도 규칙 어길 시, 
                        return false
                    }
                }
            }
        }
        
        return true
    }
    
    // 특정 응시자 위치에서 맨해튼 거리 2 이내 탐색 bfs
    private fun bfs(room: Array<String>, startR: Int, startC: Int): Boolean {
        val queue = ArrayDeque<Triple<Int, Int, Int>>() // (현재 행, 현재 열, 출발점부터의 거리)
        val visited = Array(5) { BooleanArray(5) }
        
        queue.add(Triple(startR, startC, 0))
        visited[startR][startC] = true
        
        while (queue.isNotEmpty()) {
            val (r, c, dist) = queue.removeFirst()
            
            if (dist >= 2) continue // 거리 2 이상, -> 응시자 찾을 필요 X
            
            for (i in 0 until 4) {
                val nr = r + dr[i]
                val nc = c + dc[i]
                
                // 대기실 범위 벗어남 or 이미 방문한 칸 -> 패스 
                if (nr !in 0 until 5 || nc !in 0 until 5 || visited[nr][nc]) {
                    continue
                }
                
                // 파티션(X) 막혀있다면 -> 안전 
                if (room[nr][nc] == 'X') {
                    continue
                }
                
                // 빈 테이블(O) -> 통과 가능이므로 거리 +1 큐 삽입 
                if (room[nr][nc] == 'O') {
                    visited[nr][nc] = true
                    queue.add(Triple(nr, nc, dist + 1))
                }
                
                // 거리 2 이하 + 다른 응시자(P) 만나면 -> 거리두기 위반 
                if (room[nr][nc] == 'P') {
                    return false
                }
            }
        }
        
        return true
    }
}