import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayDeque
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val stHeader = StringTokenizer(br.readLine())
    val n = stHeader.nextToken().toInt() // 사다리 수
    val m = stHeader.nextToken().toInt() // 뱀의 수
    
    // 3차원 배열 [높이][세로][가로]
    val nextPos = IntArray(101) { it }
    
    // 사다리 정보
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val v = st.nextToken().toInt()
        nextPos[u] = v
    }
    
    // 뱀 정보
    repeat(m) {
        val st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val v = st.nextToken().toInt()
        nextPos[u] = v
    }
    
    // bfs 거리 배열 (-1 초기화하여 방문 여부 체크)
    val dist = IntArray(101) { -1 }
    val queue = ArrayDeque<Int>()
    
    // 시작점 설정
    dist[1] = 0
    queue.add(1)
    
    while (queue.isNotEmpty()) {
        val current = queue.poll()
        
        // 100번 칸에 도착 => 결과 출력 후 종료
        if (current == 100) {
            println(dist[100])
            return
        }
        
        // 주사위 굴리기
        for (dice in 1..6) {
            val nextStep = current + dice
            
            // 100번 칸 넘어가면 이동 X
           if (nextStep > 100) continue
            
            // 뱀 or 사다리 O => 강제 이동한 위치가 최종 목적지(target)
            val target = nextPos[nextStep]
            
            // 아직 방문하지 않은 곳 => 큐 add
            if (dist[target] == -1) {
                // 주사위 굴린 횟수 = 현재 위치 + 1
                dist[target] = dist[current] + 1
                queue.add(target)
            }
        }
    }
}