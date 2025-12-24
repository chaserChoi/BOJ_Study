import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

/**
 * Boj 1987 - 알파벳
 */

// 전역
var r = 0
var c = 0
lateinit var map: Array<IntArray>
val visitedAlpha = BooleanArray(26) // 알파벳 방문 여부 체크
var maxCount = 0

// 상하좌우 이동 방향 배열
val dx = intArrayOf(-1, 1, 0, 0)
val dy = intArrayOf(0, 0, -1, 1)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    r = st.nextToken().toInt()
    c = st.nextToken().toInt()

    map = Array(r) { IntArray(c) }

    // input (문자 -> 숫자 변환)
    for (i in 0 until r) {
        val line = br.readLine()
        for (j in 0 until c) {
            map[i][j] = line[j] - 'A'
        }
    }

    // 시작점(0, 0)
    visitedAlpha[map[0][0]] = true
    
    // dfs
    dfs(0, 0, 1)

    println(maxCount)
}

/**
 * dfs 메서드
 * @x: 현재 x 좌표
 * @y: 현재 y 좌표
 * @count: 현재까지 이동한 칸 수
 */
fun dfs(x: Int, y: Int, count: Int) {
    // 매 단계마다 최대 칸 수 갱신
    maxCount = max(maxCount, count)
    
    // 상하좌우 탐색
    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]
        
        // map 범위 안에 있고
        if (nx in 0 until r && ny in 0 until c) {
            val nextAlpha = map[nx][ny]
            
            // 해당 알파벳 아직 방문 X
            if (!visitedAlpha[nextAlpha]) {
                visitedAlpha[nextAlpha] = true // 방문 체크
                dfs(nx, ny, count + 1) // 재귀
                visitedAlpha[nextAlpha] = false // 백트래킹
            }
        }
    }
}