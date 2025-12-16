import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    val a = st.nextToken().toInt()
    var b = st.nextToken().toInt()
    
    var count = 1
    
    while (b > a) {
        // 끝자리가 1인 경우 => 1 제거 (81 -> 8)
        if (b % 10 == 1) {
            b /= 10
        // 짝수인 경우 => 2 나눔 (162 -> 81)
        } else if (b % 2 == 0) {
            b /= 2
        } else {
            break
        }
        count++
    }
    
    // 결과
    if (b == a) {
        println(count)
    } else {
        println(-1)
    }
}