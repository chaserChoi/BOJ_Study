import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

/**
 * BOJ 17144: 미세먼지 안녕!
 */

// 전역
var R = 0
var C = 0
var T = 0
lateinit var map: Array<IntArray>
var cleanerTop = -1
var cleanerBottom = -1

// 상하좌우 방향 벡터
val dr = intArrayOf(-1, 1, 0, 0)
val dc = intArrayOf(0, 0, -1, 1)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    R = st.nextToken().toInt()
    C = st.nextToken().toInt()
    T = st.nextToken().toInt()

    map = Array(R) { IntArray(C) }

    // input
    for (i in 0 until R) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until C) {
            map[i][j] = st.nextToken().toInt()
            // 공기청정기 위치 파악
            if (map[i][j] == -1) {
                if (cleanerTop == -1) {
                    cleanerTop = i
                    cleanerBottom = i + 1
                }
            }
        }
    }

    // T초 동안 시뮬
    repeat(T) {
        spreadDust()
        operateCleaner()
    }

    // 남은 미세먼지 양
    var total = 0
    for (i in 0 until R) {
        for (j in 0 until C) {
            if (map[i][j] > 0) {
                total += map[i][j]
            }
        }
    }

    println(total)
}

/**
 * 미세먼지 확상 함수
 */
fun spreadDust() {
    val nextMap = Array(R) { IntArray(C) } // 임시 배열

    // 공기청정기 위치 복사
    nextMap[cleanerTop][0] = -1
    nextMap[cleanerBottom][0] = -1

    for (r in 0 until R) {
        for (c in 0 until C) {
            // 미세먼지 있는 경우만
            if (map[r][c] > 0) {
                val amount = map[r][c] / 5
                var spreadCount = 0

                for (i in 0 until 4) {
                    val nr = r + dr[i]
                    val nc = c + dc[i]

                    // 범위 내 & 공기청정기 아니면 확산
                    if (nr in 0 until R && nc in 0 until C && map[nr][nc] != -1) {
                        nextMap[nr][nc] += amount
                        spreadCount++
                    }
                }

                // 남은 미세먼지 누적
                nextMap[r][c] += map[r][c] - (amount * spreadCount)
            }
        }
    }

    map = nextMap
}

/**
 * 공기청정기 작동 함수
 */
fun operateCleaner() {
    // 위쪽 공기청정기 -> 반시계 방향
    // 왼쪽 열 (위 -> 아래)
    for (i in cleanerTop - 1 downTo 1) {
        map[i][0] = map[i - 1][0]
    }
    // 위쪽 행 (오른쪽 -> 왼쪽)
    for (i in 0 until C - 1) {
        map[0][i] = map[0][i + 1]
    }
    // 오른쪽 열 (아래 -> 위)
    for (i in 0 until cleanerTop) {
        map[i][C - 1] = map[i + 1][C - 1]
    }
    // 공기청정기 행 (왼쪽 -> 오른쪽)
    for (i in C - 1 downTo 2) {
        map[cleanerTop][i] = map[cleanerTop][i - 1]
    }
    // 공기청정기 바로 옆 칸 = 정화된 공기 = 0
    map[cleanerTop][1] = 0

    // 아래쪽 공기청정기 -> 시계 방향
    // 왼쪽 열 (아래 -> 위)
    for (i in cleanerBottom + 1 until R - 1) {
        map[i][0] = map[i + 1][0]
    }
    // 아래쪽 행 (오른쪽 -> 왼쪽)
    for (i in 0 until C - 1) {
        map[R - 1][i] = map[R - 1][i + 1]
    }
    // 오른쪽 열 (위 -> 아래)
    for (i in R - 1 downTo cleanerBottom + 1) {
        map[i][C - 1] = map[i - 1][C - 1]
    }
    // 공기청정기 행 (왼쪽 -> 오른쪽)
    for (i in C - 1 downTo 2) {
        map[cleanerBottom][i] = map[cleanerBottom][i - 1]
    }
    // 공기청정기 바로 옆 칸 = 정화된 공기 = 0
    map[cleanerBottom][1] = 0
}
