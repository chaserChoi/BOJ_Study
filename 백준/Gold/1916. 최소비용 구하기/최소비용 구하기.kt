import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.util.PriorityQueue
import java.util.ArrayList

/**
 * 도착 도시 & 비용 담은 데이터 클래스
 * PriorityQueue에서 비용 기준 오름차순 정렬 => Comparable 구현
 * */
data class Node(val index: Int, val cost: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return this.cost - other.cost
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val n = br.readLine().toInt() // 도시 개수
    val m = br.readLine().toInt() // 버스 개수
    
    // 인접 리스트
    val graph = ArrayList<ArrayList<Node>>()
    for (i in 0..n) {
        graph.add(ArrayList())
    }
    
    // 버스 정보
    repeat(m) {
        val st = StringTokenizer(br.readLine())
        val u = st.nextToken().toInt()
        val v = st.nextToken().toInt()
        val w = st.nextToken().toInt()
        
        graph[u].add(Node(v, w))
    }
    
    // 출발점, 도착점
    val st = StringTokenizer(br.readLine())
    val start = st.nextToken().toInt()
    val end = st.nextToken().toInt()
    
    val result = dijkstra(n, graph, start, end)
    
    println(result)
}

// 다익스트라 알고리즘 메서드
fun dijkstra(n: Int, graph: ArrayList<ArrayList<Node>>, start: Int, end: Int): Int {
    // 최소 비용 배열
    val dist = IntArray(n + 1) { Int.MAX_VALUE }
    val pq = PriorityQueue<Node>()
    
    // 시작점
    dist[start] = 0
    pq.offer(Node(start, 0))
    
    while (pq.isNotEmpty()) {
        val current = pq.poll()
        val curIndex = current.index
        val curCost = current.cost
        
        // 큐에서 꺼낸 비용이 현재 기록된 최단 비용보다 크다면 => 스킵
        if (curCost > dist[curIndex]) continue
        
        // 인접 도시들 확인
        for (next in graph[curIndex]) {
            val nextIndex = next.index
            val nextCost = curCost + next.cost
            
            // 더 적은 비용으로 갈 수 있는 경우 => 갱신
            if (nextCost < dist[nextIndex]) {
                dist[nextIndex] = nextCost
                pq.offer(Node(nextIndex, nextCost))
            }
        }
    }
    
    return dist[end]
}