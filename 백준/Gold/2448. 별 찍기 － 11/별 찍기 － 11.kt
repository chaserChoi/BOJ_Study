import java.io.BufferedReader
import java.io.InputStreamReader

// 전역
lateinit var map: Array<CharArray>

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()

    // 세로 크기 = n, 가로 크기 = 2 * n - 1 (기본 = 공백으로 채움)
    map = Array(n) { CharArray(2 * n - 1) { ' ' } }

    // 재귀
    drawStar(0, n - 1, n)

    val sb = StringBuilder()
    for (i in 0 until n) {
        sb.append(map[i]).append("\n")
    }
    print(sb)
}

/**
 * 재귀
 * @r: 삼각형 꼭짓점 행 좌표
 * @c: 삼각형 꼭짓점 열 좌표
 * @size: 현재 삼각형 높이
 */
fun drawStar(r: Int, c: Int, size: Int) {
    // 높이 = 3
    if (size == 3) {
        // 첫째 줄
        map[r][c] = '*'
        // 둘째 줄
        map[r + 1][c - 1] = '*'
        map[r + 1][c + 1] = '*'
        // 셋째 줄
        map[r + 2][c - 2] = '*'
        map[r + 2][c - 1] = '*'
        map[r + 2][c] = '*'
        map[r + 2][c + 1] = '*'
        map[r + 2][c + 2] = '*'
        return
    }

    val newSize = size / 2

    // 위쪽 삼각형
    drawStar(r, c, newSize)

    // 아래 왼쪽 삼각형
    drawStar(r + newSize, c - newSize, newSize)

    // 아래 오른쪽 삼각형
    drawStar(r + newSize, c + newSize, newSize)
}