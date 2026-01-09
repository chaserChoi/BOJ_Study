import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

// 전역
var n = 0
var m = 0
lateinit var map: Array<IntArray>
var cheeseCount = 0

// 상하좌우 방향 벡터
val dr = intArrayOf(-1, 1, 0, 0)
val dc = intArrayOf(0, 0, -1, 1)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    n = st.nextToken().toInt()
    m = st.nextToken().toInt()

    map = Array(n) { IntArray(m) }

    // 맵 입력 및 초기 치즈 개수 파악
    for (i in 0..< n) {
        st = StringTokenizer(br.readLine())
        for (j in 0 ..< m) {
            map[i][j] = st.nextToken().toInt()
            if (map[i][j] == 1) {
                cheeseCount++
            }
        }
    }

    var time = 0

    // 치즈가 모두 녹을 때까지 반복
    while (cheeseCount > 0) {
        // 외부 공기 파악 -> bfs
        val outsideAir = Array(n) { BooleanArray(m) }
        bfsOutsideAir(outsideAir)

        // 녹을 치즈 찾기
        val meltingCheese = ArrayList<Pair<Int, Int>>()

        for (i in 0 ..< n) {
            for (j in 0 ..< m) {
                // 치즈인 경우
                if (map[i][j] == 1) {
                    var contactCount = 0

                    // 방향 확인
                    for (d in 0 ..< 4) {
                        val nr = i + dr[d]
                        val nc = j + dc[d]

                        // 맵 범위 내 & 외부 공기와 접촉했다면
                        if (nr in 0 ..< n && nc in 0 ..< m) {
                            if (outsideAir[nr][nc]) {
                                contactCount++
                            }
                        }
                    }

                    // 2번 이상 접촉 시
                    if (contactCount >= 2) {
                        meltingCheese.add(Pair(i, j))
                    }
                }
            }
        }

        // 치즈 녹이기
        for ((r, c) in meltingCheese) {
            map[r][c] = 0
            cheeseCount--
        }

        time++
    }

    println(time)
}

/**
 * (0, 0)부터 시작하여 외부와 연결된 공기만 true로 표시
 */
fun bfsOutsideAir(visited: Array<BooleanArray>) {
    val queue: Queue<Pair<Int, Int>> = LinkedList()

    // 가장자리에 치즈 X -> (0, 0) = 외부 공기
    queue.add(Pair(0, 0))
    visited[0][0] = true

    while (queue.isNotEmpty()) {
        val (r, c) = queue.poll()

        for (i in 0 ..< 4) {
            val nr = r + dr[i]
            val nc = c + dc[i]

            if (nr in 0 ..< n && nc in 0 ..< m) {
                // 아직 방문하지 않고, 빈 칸(0)이라면
                if (!visited[nr][nc] && map[nr][nc] == 0) {
                    visited[nr][nc] = true
                    queue.add(Pair(nr, nc))
                }
            }
        }
    }
}
