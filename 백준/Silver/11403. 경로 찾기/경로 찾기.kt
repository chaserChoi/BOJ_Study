import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val graph = Array(n) { IntArray(n) }
    
    // graph
    for (i in 0 until n) {
		val st = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            graph[i][j] = st.nextToken().toInt()
        }
    }
    
    // 플로이드-워셜 알고리즘
 	// k = 거쳐가는 노드
    for (k in 0 until n) {
        // i = 출발 
        for (i in 0 until n) {
            // j = 도착
            for (j in 0 until n) {
                if (graph[i][k] == 1 && graph[k][j] == 1) {
                    graph[i][j] = 1
                }
            }
        }
    }
    
    // result
    val sb = StringBuilder()
    for (i in 0 until n) {
        for (j in 0 until n) {
            sb.append(graph[i][j]).append(" ")
        }
        sb.append("\n")
    }
    print(sb)
}