import java.io.BufferedReader
import java.io.InputStreamReader

// 전역 변수
var n = 0
var count = 0
lateinit var isUsed1: BooleanArray // 열(col) 점유 여부
lateinit var isUsed2: BooleanArray // / 대각선 점유 여부 (= row + col)
lateinit var isUsed3: BooleanArray // \ 대각선 점유 여부 (= row - col)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    n = br.readLine().toInt()

    isUsed1 = BooleanArray(n)
    isUsed2 = BooleanArray(2 * n) 
    isUsed3 = BooleanArray(2 * n) 

    // dfs (row: 0부터 시작)
    dfs(0)

    println(count)
}

/**
 * dfs 메서드
 * @curRow: 현재 퀸 놓으려는 행
 */
fun dfs(curRow: Int) {
    // n개 퀸 모두 놓은 경우
    if (curRow == n) {
        count++
        return
    }

    // 현재 행(curRow)에서 모든 열 확인
    for (i in 0 until n) {
        // 같은 열 || / 대각선 || \ 대각선에 퀸 있는 경우
        if (isUsed1[i] || isUsed2[curRow + i] || isUsed3[curRow - i + n - 1]) {
            continue 
        }

        // 퀸 놓기
        isUsed1[i] = true
        isUsed2[curRow + i] = true
        isUsed3[curRow - i + n - 1] = true

        // 다음 행
        dfs(curRow + 1)

        // 백트래킹
        isUsed1[i] = false
        isUsed2[curRow + i] = false
        isUsed3[curRow - i + n - 1] = false
    }
}