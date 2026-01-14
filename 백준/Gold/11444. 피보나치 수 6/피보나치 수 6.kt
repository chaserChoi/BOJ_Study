import java.io.BufferedReader
import java.io.InputStreamReader

const val MOD = 1_000_000_007L // 나머지

typealias Matrix = Array<LongArray> // 2x2 행렬 타입

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toLong()

    // 파보나치 기본 행렬 A
    val matrix = Array(2) { LongArray(2) }
    matrix[0][0] = 1
    matrix[0][1] = 1
    matrix[1][0] = 1
    matrix[1][1] = 0

    // 거듭제공 수행 (분할 정복)
    val result = power(matrix, n)

    // A^n[0][1](or [1][0]) = Fn
    println(result[0][1])
}

/**
 * 행렬 거듭제곱 함수
 */
fun power(a: Matrix, exp: Long): Matrix {
    // ^1 -> 그대로 반환
    if (exp == 1L) {
        return Array(2) { i ->
            LongArray(2) { j -> a[i][j] % MOD }
        }
    }

    // 지수 절반으로 나누어 재귀 호출
    val temp = power(a, exp / 2)

    // temp^2
    val res = multiply(temp, temp)

    // 홀수 승수 -> 원래 행렬 A 한 번 더 곱하기
    if (exp % 2 == 1L) {
        return multiply(res, a)
    }

    return res
}

/**
 * 두 2x2 행렬 곱하는 함수
 */
fun multiply(o1: Matrix, o2: Matrix): Matrix {
    val result = Array(2) { LongArray(2) }

    for (i in 0 ..< 2) {
        for (j in 0 ..< 2) {
            var sum = 0L
            for (k in 0 ..< 2) {
                sum += (o1[i][k] * o2[k][j])
                sum %= MOD
            }
            result[i][j] = sum
        }
    }

    return result
}
