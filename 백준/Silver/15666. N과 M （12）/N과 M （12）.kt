import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 전역 변수
var n = 0
var m = 0
lateinit var numbers: List<Int> // 입력
lateinit var result: IntArray // 현재 만들어진 수열
val sb = StringBuilder()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()
    
    st = StringTokenizer(br.readLine())
    val tempSet = HashSet<Int>()
    repeat(n) {
        tempSet.add(st.nextToken().toInt())
    }
    
    // 사전 순 출력을 위한 정렬
    numbers = tempSet.sorted()
    result = IntArray(m)
    
    // dfs 탐색
    dfs(0, 0)
    
    print(sb)
}

// depth: 현재까지 선택한 숫자 개수
// start: 이번 단계에서 선택 시작할 인덱스 (비내림차순 유지)
fun dfs(depth: Int, start: Int) {
    // m개를 모두 선택했으면 결과 버퍼에 추가하고 리턴
    if (depth == m) {
        for (num in result) {
            sb.append(num).append(" ")
        }
        sb.append("\n")
        return
    }
    
    // start부터 끝까지 반복
    for (i in start until numbers.size) {
        result[depth] = numbers[i]
        
        dfs(depth + 1, i)
    }
}