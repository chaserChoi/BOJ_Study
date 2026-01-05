import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    // 수열 A
    val n = br.readLine().toInt()
    val a = IntArray(n)
    var st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        a[i] = st.nextToken().toInt()
    }

    // 수열 B
    val m = br.readLine().toInt()
    val b = IntArray(m)
    st = StringTokenizer(br.readLine())
    for (i in 0 until m) {
        b[i] = st.nextToken().toInt()
    }

    val result = ArrayList<Int>()

    // 현재 탐색 시작할 인덱스 위치
    var idxA = 0
    var idxB = 0

    while (true) {
        var maxVal = -1
        var nextIdxA = -1
        var nextIdxB = -1
        var found = false

        // 현재 범위(idxA~, idxB~) 내에서 공통으로 존재하는 가장 큰 수 찾기 (사전 순으로 가장 나중 -> 역순)
        for (v in 100 downTo 1) {
            var tempA = -1
            var tempB = -1

            // A에서 v가 처음 등장하는 위치 찾기
            for (i in idxA until n) {
                if (a[i] == v) {
                    tempA = i
                    break
                }
            }

            // B에서 v가 처음 등장하는 위치 찾기
            for (i in idxB until m) {
                if (b[i] == v) {
                    tempB = i
                    break
                }
            }

            // 두 수열 모두에 해당 숫자가 존재
            if (tempA != -1 && tempB != -1) {
                maxVal = v
                nextIdxA = tempA
                nextIdxB = tempB
                found = true
                break
            }
        }

        if (!found) break // 공통되는 숫자 X -> 종료

        // 찾은 수 추가 & 인덱스를 다음 위치로 갱신
        result.add(maxVal)
        idxA = nextIdxA + 1
        idxB = nextIdxB + 1
    }

    println(result.size)
    if (result.isNotEmpty()) {
        val sb = StringBuilder()
        for (num in result) {
            sb.append(num).append(" ")
        }
        println(sb.toString().trim())
    }
}
