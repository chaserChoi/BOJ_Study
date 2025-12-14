import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.TreeMap
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val t = br.readLine().toInt()
    
    repeat(t) {
        // 연산 개수
        val k = br.readLine().toInt()
        
        val map = TreeMap<Int, Int>()
        
        repeat(k) {
            val st = StringTokenizer(br.readLine())
            val command = st.nextToken()
            val value = st.nextToken().toInt()
            
            if (command == "I") {
                // 삽입 연산
                map[value] = map.getOrDefault(value, 0) + 1
            } else {
                // 삭제 연산
                if (map.isNotEmpty()) {
                    // D = 1 => 최댓값(lastKey), D = -1 => 최솟값(firstKey)
                    val key = if (value == 1) map.lastKey() else map.firstKey()
                    
                    // 해당 숫자의 개수 확인
                    val count = map[key]!!
                    
                    // 1개만 남았으면 아예 제거, 여러 개면 개수 - 1
                    if (count == 1) {
                        map.remove(key)
                    } else {
                        map[key] = count - 1
                    }
                }
            }
        }
        
        // 출력
        if (map.isEmpty()) {
            sb.append("EMPTY\n")
        } else {
            sb.append("${map.lastKey()} ${map.firstKey()}\n")
        }
    }
    print(sb)
}