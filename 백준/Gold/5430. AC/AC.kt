import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayDeque
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    
    val t = br.readLine().toInt()
    
    repeat(t) {
        val command = br.readLine()
        val n = br.readLine().toInt()
        val arrayString = br.readLine()
        
        // 파싱 및 deque 초기화
        val st = StringTokenizer(arrayString, "[],")
        val deque = ArrayDeque<Int>()
        
        while (st.hasMoreTokens()) {
            deque.add(st.nextToken().toInt())
        }
        
        var isReversed = false
        var isError = false
        
        // 명령어 수행
        for (cmd in command) {
            if (cmd == 'R') {
                // 뒤집기
                isReversed = !isReversed
            } else {
                // 'D'
                if (deque.isEmpty()) {
                    isError = true
                    break
                }
                // 방향에 따라 삭제 위치 결정
                if (isReversed) {
                    deque.removeLast()
                } else {
                    deque.removeFirst()
                }
            }
        }
        
        // 결과 출력
        if (isError) {
            sb.append("error\n")
        } else {
            sb.append("[")
            if (deque.isNotEmpty()) {
                // 역방향 => 뒤에서부터 출력
                if (isReversed) {
                    while (deque.size > 1) {
                        sb.append(deque.removeLast()).append(",")
                    }
                    sb.append(deque.removeLast())
                // 정방향 => 앞에서부터 출력
                } else {
                    while (deque.size > 1) {
                        sb.append(deque.removeFirst()).append(",")
                    }
                    sb.append(deque.removeFirst())
                }
            }
            sb.append("]\n")
        }
    }
    print(sb)
}