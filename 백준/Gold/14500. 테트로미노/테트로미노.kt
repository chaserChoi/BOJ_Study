import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

// 전역 변수
lateinit var map: Array<IntArray>
lateinit var visited: Array<BooleanArray>
var n = 0
var m = 0
var result = 0

// 상하좌우 방향 배열
val dx = intArrayOf(0, 0, 1, -1)
val dy = intArrayOf(1, -1, 0, 0)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()
    map = Array(n) { IntArray(m) }
    visited = Array(n) { BooleanArray(m) }
    
    // 지도 입력 받기
    for (i in 0 until n) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until m) {
            map[i][j] = st.nextToken().toInt()
        }
    }
    
    // 모든 좌표 탐색 시작
    for (i in 0 until n) {
        for (j in 0 until m) {
            // 1. dfs로 4칸 탐색 (ㅜ 모양 제외)
            visited[i][j] = true
            dfs(i, j, map[i][j], 1)
            visited[i][j] = false
            
            // 2. ㅜ 모양 별도 처리
            checkTShape(i, j)
        }
    }
    
    println(result)
}

/**
 * dfs 메서드
 * ㅜ 모양 제외 대상
 **/
fun dfs(x: Int, y: Int, sum: Int, depth: Int) {
    // 깊이 = 4 => 테트로미노 완성 (최댓값 갱신)
    if (depth == 4) {
        result = max(result, sum)
        return
    }
    
    // 상하좌우 탐색
    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]
        
        // 맵 범위 내에 있고, 아직 방문하지 않았다면
        if (nx in 0 until n && ny in 0 until m && !visited[nx][ny]) {
            visited[nx][ny] = true
            dfs(nx, ny, sum + map[nx][ny], depth + 1)
            visited[nx][ny] = false // 백트래킹 (다른 경로 탐색 위해 방문 해제)
        }
    }
}

/**
 * ㅜ 모양 처리
 * 중심 좌표(x, y) 기준으로 인접한 4칸 중 3개 선택
 **/
fun checkTShape(x: Int, y: Int) {
    var sum = map[x][y]
    var minVal = 1001 // 인접한 칸 중 가장 작은 값 저장 -> 4 방향일 때 빼기 위함
    var wings = 0 // 유효 날개(인접 칸) 개수
    
    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]
        
        // 범위 체크
        if (nx in 0 until n && ny in 0 until m) {
            wings++
            sum += map[nx][ny]
            // 가장 작은 값 기록
            if (map[nx][ny] < minVal) {
                minVal = map[nx][ny]
            }
        }
    }
    
    // 날개가 4개(+) => 가장 작은 날개 하나 버리기
    if (wings == 4) {
        result = max(result, sum - minVal)
    }
    // 날개 = 3개(ㅜ, ㅏ, ㅗ, ㅓ) => 그대로 합 비교
    else if (wings == 3) {
        result = max(result, sum)
    }
}