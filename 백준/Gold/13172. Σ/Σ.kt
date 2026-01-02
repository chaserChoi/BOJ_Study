import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 모듈러 상수 (소수)
const val MOD = 1_000_000_007L

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val m = br.readLine().toInt() // 주사위 수

    var totalExpectation = 0L

    repeat(m) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toLong() // N면체
        val s = st.nextToken().toLong() // 면에 적힌 수의 합 

        // 각 주사위의 기댓값 = S / N
        // 모듈러 연산에서 S / N은 S * (N의 역원)과 같다.
        // 페르마의 소정리에 의해 N의 역원 = N^(MOD-2) % MOD
        
        val nInverse = power(n, MOD - 2)
        val currentExpectation = (s * nInverse) % MOD
        
        // 전체 합에 누적 (오버플로우 방지를 위해 덧셈 후 모듈러 연산)
        totalExpectation = (totalExpectation + currentExpectation) % MOD
    }

    println(totalExpectation)
}

/**
 * 모듈러 거듭제곱 함수 (분할 정복 이용)
 */
fun power(base: Long, exp: Long): Long {
    var result = 1L
    var b = base
    var e = exp

    while (e > 0) {
        // 지수 == 홀수 -> 결과값에 현재 밑(b)을 곱함
        if (e % 2 == 1L) {
            result = (result * b) % MOD
        }
        // 지수를 절반으로 줄이고, 밑을 제곱함
        b = (b * b) % MOD
        e /= 2
    }
    return result
}