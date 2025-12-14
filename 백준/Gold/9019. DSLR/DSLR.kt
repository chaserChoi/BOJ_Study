import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val t = br.readLine().toInt()
    
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val start = st.nextToken().toInt()
        val target = st.nextToken().toInt()
        
        // 방문 여부 체크 (0 ~ 9999)
        val visited = BooleanArray(10000)
        
        val parent = IntArray(10000) // i라는 숫자를 만들기 직전의 숫자
        val command = CharArray(10000) // i라는 숫자를 만들기 위해 수행한 연산(D, S, L, R)
        
        val queue: Queue<Int> = LinkedList()
        
        queue.add(start)
        visited[start] = true
        
        // bfs
        while (queue.isNotEmpty()) {
            val cur = queue.poll()
            
            if (cur == target) break
            
            val d = (cur * 2) % 10000
            if (!visited[d]) {
                visited[d] = true
                parent[d] = cur
                command[d] = 'D'
                queue.add(d)
            }
            
            val s = if (cur == 0) 9999 else cur - 1
            if (!visited[s]) {
                visited[s] = true
                parent[s] = cur
                command[s] = 'S'
                queue.add(s)
            }
            
            val l = (cur % 1000) * 10 + (cur / 1000)
            if (!visited[l]) {
                visited[l] = true
                parent[l] = cur
                command[l] = 'L'
                queue.add(l)
            }
            
            val r = (cur % 10) * 1000 + (cur / 10)
            if (!visited[r]) {
                visited[r] = true
                parent[r] = cur
                command[r] = 'R'
                queue.add(r)
            }
        }
        
        val path = StringBuilder()
        var temp = target
        while (temp != start) {
            path.append(command[temp])
            temp = parent[temp]
        }
        
        sb.append(path.reverse()).append("\n")
    }
    print(sb)
}