import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt() // 수빈이 위치
    val k = st.nextToken().toInt() // 동생 위치

    // N == K -> 이동 필요 X
    if (n == k) {
        println(0)
        println(1)
        return
    }

    bfs(n, k)
}

fun bfs(start: Int, target: Int) {
    val maxPos = 100000
    // 각 위치에 도달하는 최소 시간 저장 (초기화 필요 없음, 로직으로 커버하거나 큰 값 초기화)
    // 여기서는 0이면 미방문으로 간주하되, 시작점 처리를 주의해야 함.
    // 편의상 방문 체크를 '시간'으로 기록
    val visited = IntArray(maxPos + 1) { Int.MAX_VALUE }
    
    // 큐에는 현재 위치만 저장해도 됨 (시간은 visited 배열로 확인하거나 큐에 같이 저장)
    // (위치, 시간)
    val queue: Queue<Pair<Int, Int>> = LinkedList()

    queue.add(Pair(start, 0))
    visited[start] = 0

    var minTime = Int.MAX_VALUE
    var count = 0

    while (queue.isNotEmpty()) {
        val (currentPos, time) = queue.poll()

        // 이미 최단 시간을 찾았고, 현재 큐에서 꺼낸 시간이 그보다 크다면 더 볼 필요 없음
        // (BFS이므로 시간 순서대로 나옴 -> 이후는 모두 minTime보다 큼)
        if (minTime != Int.MAX_VALUE && time > minTime) break

        // 동생 위치 도달
        if (currentPos == target) {
            // 처음 도착 -> 최단 시간 기록
            if (minTime == Int.MAX_VALUE) {
                minTime = time
                count = 1
            } else if (minTime == time) {
                // 이미 기록된 최단 시간과 같다면 -> 카운트 증가
                count++
            }
            continue // 목표에 도달했으므로 더 이상 이동 X (이 경로 종료)
        }

        // 3가지 이동 방법
        val nextMoves = intArrayOf(currentPos - 1, currentPos + 1, currentPos * 2)

        for (nextPos in nextMoves) {
            // 범위 체크
            if (nextPos in 0..maxPos) {
                // 핵심 로직:
                // 1. 아직 방문하지 않았거나 (visited[nextPos] == Int.MAX_VALUE)
                // 2. 방문했었지만, 지금 도달한 시간과 같은 시간이라면 (visited[nextPos] == time + 1)
                // -> 큐에 넣어서 경우의 수를 계산해야 함
                if (visited[nextPos] >= time + 1) {
                    visited[nextPos] = time + 1
                    queue.add(Pair(nextPos, time + 1))
                }
            }
        }
    }

    println(minTime)
    println(count)
}