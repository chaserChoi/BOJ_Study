import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.util.Arrays

// 전역 변수
var n = 0
var m = 0
lateinit var numbers: IntArray // 입력
lateinit var result: IntArray // 현재 만들어진 수열
lateinit var visited: BooleanArray // 방문 여부
val sb = StringBuilder()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()
    
    numbers = IntArray(n)
    result = IntArray(m)
    visited = BooleanArray(n)
    
    st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        numbers[i] = st.nextToken().toInt()
    }
    
    // 사전 순 출력을 위한 정렬
    Arrays.sort(numbers)
    
    // dfs 탐색
    dfs(0)
    
    print(sb)
}

// depth: 현재까지 선택한 숫자 개수
fun dfs(depth: Int) {
    // m개를 모두 선택했으면 결과 버퍼에 추가하고 리턴
    if (depth == m) {
        for (num in result) {
            sb.append(num).append(" ")
        }
        sb.append("\n")
        return
    }
    
    // 중복 수열 방지
    var prev = 0
    
    for (i in 0 until n) {
        // 이미 방문한 인덱스 => 패스
        if (visited[i]) continue
        
        // 직전에 고른 값과 같으면 패스
        if (prev == numbers[i]) continue
        
        
        visited[i] = true
        result[depth] = numbers[i]
        prev = numbers[i] // 현재 값을 prev 기록 => 다음 루프에서 같은 값 나올시 패스
        dfs(depth + 1)
        visited[i] = false
    }
}