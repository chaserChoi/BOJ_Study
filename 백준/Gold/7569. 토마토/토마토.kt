import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayDeque
import java.util.StringTokenizer

data class Point(val z: Int, val y: Int, val x: Int) // 좌표를 나타내는 데이터 클래스 (높이, 세로, 가로)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    var st = StringTokenizer(br.readLine())
    val m = st.nextToken().toInt() // 가로
    val n = st.nextToken().toInt() // 세로
    val h = st.nextToken().toInt() // 높이
    
    // 3차원 배열 [높이][세로][가로]
    val map = Array(h) { Array(n) { IntArray(m) } }
    
    val queue = ArrayDeque<Point>()
    
    var unripe = 0
    
    for (k in 0 until h) {
        for (i in 0 until n) {
            st = StringTokenizer(br.readLine())
            for (j in 0 until m) {
                map[k][i][j] = st.nextToken().toInt()
                
                // 익은 토마토(=1) => 큐 삽입 (시작점)
                if (map[k][i][j] == 1) {
                    queue.add(Point(k, i, j))
                }
                // 익지 않은 토마토(=0) => 카운트 증가
                else if (map[k][i][j] == 0) {
                    unripe++
                }
            }
        }
    }
    
    // 저장될 때부터 모든 토마토가 익은 상태라면 => 0
    if (unripe == 0) {
        println(0)
        return
    }
    
    // 6방향 이동
    val dz = intArrayOf(0, 0, 0, 0, 1, -1)
    val dy = intArrayOf(0, 0, 1, -1, 0, 0)
    val dx = intArrayOf(1, -1, 0, 0, 0, 0)
    
    // bfs
    var maxDays = 0
    
    while (queue.isNotEmpty()) {
        val current = queue.poll()
        
        for (i in 0 until 6) {
            val nz = current.z + dz[i]
            val ny = current.y + dy[i]
            val nx = current.x + dx[i]
            
            if (nz in 0 until h && ny in 0 until n && nx in 0 until m) {
                // 익지 않은 토마토만 전파
                if (map[nz][ny][nx] == 0) {
                    // 이전 위치의 값 + 1 => 일수 기록
                    map[nz][ny][nx] = map[current.z][current.y][current.x] + 1
                    queue.add(Point(nz, ny, nx))
                    
                    // 익지 않은 토마토 개수 감소
                    unripe--
                }
            }
        }
    }
    
    // 결과 출력
    if (unripe > 0) {
        println(-1)
    } else {
        // 전체를 순회하며 가장 큰 값(마지막 날) 찾음
        // 1부터 시작했으므로 실제 걸린 일수 -1  
        var result = 0
        for (k in 0 until h) {
            for (i in 0 until n) {
                for (j in 0 until m) {
                    if (map[k][i][j] > result) {
                        result = map[k][i][j]
                    }
                }
            }
        }
        println(result - 1)
    }
}