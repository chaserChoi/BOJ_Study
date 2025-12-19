import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val n = br.readLine().toInt()
    
    // 격자판 입력 
    val grid = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            grid[i][j] = st.nextToken().toInt()
        }
    }

    // dp[row][col][direction]
    // direction -> 0: 가로, 1: 세로, 2: 대각선
    val dp = Array(n) { Array(n) { IntArray(3) } }

    // 초기 상태 설정
    dp[0][1][0] = 1

    // dp
    for (r in 0 until n) {
        for (c in 0 until n) {
            // 현재 위치가 벽(1) => 파이프가 올 수 없음
            if (grid[r][c] == 1) continue

            // 1. 가로 방향(0)으로 (r, c)에 도달하는 경우
            if (c - 1 >= 0) {
                // 이전 상태가 가로(0) 또는 대각선(2)이어야 밀어서 가로가 됨
                dp[r][c][0] += dp[r][c - 1][0] + dp[r][c - 1][2]
            }

            // 2. 세로 방향(1)으로 (r, c)에 도달하는 경우
            if (r - 1 >= 0) {
                // 이전 상태가 세로(1) 또는 대각선(2)이어야 밀어서 세로가 됨
                dp[r][c][1] += dp[r - 1][c][1] + dp[r - 1][c][2]
            }

            // 3. 대각선 방향(2)으로 (r, c)에 도달하는 경우
            if (r - 1 >= 0 && c - 1 >= 0) {
                if (grid[r - 1][c] == 0 && grid[r][c - 1] == 0) {
                    // 이전 상태가 가로(0), 세로(1), 대각선(2) 모두 가능
                    dp[r][c][2] += dp[r - 1][c - 1][0] + dp[r - 1][c - 1][1] + dp[r - 1][c - 1][2]
                }
            }
        }
    }

    // 최종 도착지 (N-1, N-1) 도달하는 모든 방향의 경우의 수
    val result = dp[n - 1][n - 1][0] + dp[n - 1][n - 1][1] + dp[n - 1][n - 1][2]
    println(result)
}