import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    
    // 연산 중 오버플로우 방지를 위해 Long 반환
    val a = st.nextToken().toLong()
    val b = st.nextToken().toLong()
    val c = st.nextToken().toLong()
    
    println(pow(a, b, c))
}

// 분할 정복 이용한 거듭제곱 함수
fun pow(a: Long, b: Long, c: Long): Long {
    // 지수 1
    if (b == 1L) {
        return a % c
    }
    
    // 지수 절반으로 나누어 재귀 호출
    val temp = pow(a, b / 2, c)
    
    /**
     * temp * temp 과정에서 Long 범위 넘지 않음
     * 하지만 안전하게 mod 연산
     * */
 	if (b % 2 == 1L) {
        // 홀수
        // (temp * temp % c) 먼저 계산 후 크기 줄인 뒤 a 곱함
        return ((temp * temp % c) * a) % c
    } else {
        // 짝수
        return (temp * temp) % c
    }
}
