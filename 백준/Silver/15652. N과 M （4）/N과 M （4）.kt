import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 전역 변수
var n = 0
var m = 0
lateinit var arr: IntArray
val sb = StringBuilder()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()
    
    arr = IntArray(m)
    
    dfs(0, 1)
    
    print(sb)
}

// depth: 현재 선택한 개수, start: 탐색 시작 숫자
fun dfs(depth: Int, start: Int) {
    // m개를 모두 선택 => sb 저장
    if (depth == m) {
        for (num in arr) {
            sb.append(num).append(" ")
        }
        sb.append("\n")
        return 
    }
    
    // start ~ n 반복 (비내림차순)
    for (i in start..n) {
        arr[depth] = i
        // 다음 재귀 호출 시 => i부터 시작하도록 전달 (중복 허용)
        // 중복 X => dfs(depth + 1, i + 1)
        dfs(depth + 1, i)
    }
}
