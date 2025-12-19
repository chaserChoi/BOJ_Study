import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.util.ArrayDeque

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    
    val n = st.nextToken().toInt() // 수빈 위치
    val k = st.nextToken().toInt() // 동생 위치
    
    val maxPos = 100000
    val time = IntArray(maxPos + 1) { -1 } // 방문 시간 기록 배열 (기본값 -1)
    val deque = ArrayDeque<Int>()
    
    // 시작점
    deque.add(n)
    time[n] = 0
    
    while (deque.isNotEmpty()) {
        val current = deque.poll()
        
        // 동생 위치 도달 시
        if (current == k) {
            println(time[k])
            return
        }
        
        // 순간이동 (2 * x) => 덱 앞에 추가 (0초 소요)
        val nextTeleport = current * 2
        if (nextTeleport <= maxPos && time[nextTeleport] == -1) {
            time[nextTeleport] = time[current]
            deque.addFirst(nextTeleport)
        }
        
        // 뒤로 걷기 (x - 1) => 덱 뒤에 추가 (1초 소요)
        val nextBack = current - 1
        if (nextBack >= 0 && time[nextBack] == -1) {
            time[nextBack] = time[current] + 1
            deque.addLast(nextBack)
        }
        
        // 앞으로 걷기 (x + 1) => 덱 뒤에 추가 (1초 소요)
        val nextForward = current + 1
        if (nextForward <= maxPos && time[nextForward] == -1) {
            time[nextForward] = time[current] + 1
            deque.addLast(nextForward)
        }
    }
}
