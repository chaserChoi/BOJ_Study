import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayDeque
import java.util.StringTokenizer

/**
 * 큐에 넣을 데이터 클래스
 * r: 행
 * c: 열
 * dist: 시작점부터의 거리
 * broken: 벽을 부순 여부 (0 또는 1)
 */
data class Node(val r: Int, val c: Int, val dist: Int, val broken: Int)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    // 맵 입력
    val map = Array(n) { IntArray(m) }
    for (i in 0..< n) {
        val line = br.readLine()
        for (j in 0..< m) {
            map[i][j] = line[j] - '0'
        }
    }

    // 방문 배열(visited[행][열][벽 부순 여부])
    val visited = Array(n) { Array(m) { BooleanArray(2) } }

    val queue = ArrayDeque<Node>()

    // 시작점 (0, 0), 거리 = 1, 벽 부순 여부 = 0
    queue.add(Node(0, 0, 1, 0))
    visited[0][0][0] = true

    // 상하좌우 방향 벡터
    val dr = intArrayOf(-1, 1, 0, 0)
    val dc = intArrayOf(0, 0, -1, 1)

    while (queue.isNotEmpty()) {
        val curr = queue.poll()

        // 목표 지점 도달 시 -> 거리 출력 후 종료
        if (curr.r == n - 1 && curr.c == m - 1) {
            println(curr.dist)
            return
        }

        for (i in 0..<4) {
            val nr = curr.r + dr[i]
            val nc = curr.c + dc[i]

            // 맵 범위 체크
            if (nr in 0..< n && nc in 0..< m) {
                // 다음 칸이 빈 칸(0)인 경우
                if (map[nr][nc] == 0) {
                    if (!visited[nr][nc][curr.broken]) {
                        visited[nr][nc][curr.broken] = true
                        queue.add(Node(nr, nc, curr.dist + 1, curr.broken))
                    }
                }

                // 다음 칸이 벽(1)인 경우
                else if (map[nr][nc] == 1) {
                    if (curr.broken == 0 && !visited[nr][nc][1]) {
                        visited[nr][nc][1] = true
                        queue.add(Node(nr, nc, curr.dist + 1, 1))
                    }
                }
            }
        }
    }

    println(-1)
}
