import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer
import kotlin.math.max

// 좌표 데이터 클래스
data class Point(val r: Int, val c: Int)

// 전역 변수
var n = 0
var m = 0
lateinit var originalMap: Array<IntArray>
val virusList = ArrayList<Point>() // 초기 바이러스 위치
var maxSafeArea = 0

// 상하좌우 방향 벡터
val dr = intArrayOf(-1, 1, 0, 0)
val dc = intArrayOf(0, 0, -1, 1)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()
    
    originalMap = Array(n) { IntArray(m) }
    
    for (i in 0 until n) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until m) {
            originalMap[i][j] = st.nextToken().toInt()
            // 바이러스 위치 미리 저장 (BFS 시작점)
            if (originalMap[i][j] == 2) {
                virusList.add(Point(i, j))
            }
        }
    }
    
    // 벽 3개 세우는 모든 경우의 수 탐색 시작
    buildWalls(0)
    
    println(maxSafeArea)
    
}

/**
 * 백트래킹 이용해 벽 3개 세우기
 * count: 현재까지 세운 벽 개수
 */
fun buildWalls(count: Int) {
    // 벽 3개 모두 세움 -> 바이러스 퍼뜨리기 시뮬레이션 수행
    if (count == 3) {
        spreadVirus()
        return
    }
    
    // 모든 좌표 순회하여 빈 칸(0)에 벽 세움
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (originalMap[i][j] == 0) {
                originalMap[i][j] = 1 // 벽 세우기
                buildWalls(count + 1) // 다음 벽 세우러 재귀 호출
                originalMap[i][j] = 0 // 백트래킹
            }
        }
    }
}

/**
 * bfs 이용한 바이러스 확산 및 안전 영역 크기 계산 함수
 */
fun spreadVirus() {
    // 맵 깊은 복사
    val tempMap = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        tempMap[i] = originalMap[i].clone()
    }
    
    // bfs
    val queue: Queue<Point> = LinkedList()
    // 초기 바이러스 위치 삽입
    for (virus in virusList) {
        queue.add(virus)
    }
    
    // 바이러스 확산
    while (queue.isNotEmpty()) {
        val current = queue.poll()
        
        for (i in 0 until 4) {
            val nr = current.r + dr[i]
            val nc = current.c + dc[i]
            
            // 맵 범위 내에 있고, 빈 칸(0)이라면 바이러스 확산
            if (nr in 0 until n && nc in 0 until m) {
                if (tempMap[nr][nc] == 0) {
                    tempMap[nr][nc] = 2 // 감염됨
                    queue.add(Point(nr, nc))
                }
            }
        }
    }
    
    // 안전 영역(0) 개수
    var safeCount = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (tempMap[i][j] == 0) {
                safeCount++
            }
        }
    }
    
    // max 갱신
    maxSafeArea = max(maxSafeArea, safeCount)
}