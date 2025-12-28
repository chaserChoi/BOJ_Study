import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

// 전역
var n = 0
var b = 0L
val MOD = 1000

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    n = st.nextToken().toInt()
    b = st.nextToken().toLong()

    // 행렬
    val matrix = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until n) {
            matrix[i][j] = st.nextToken().toInt() % MOD
        }
    }

    // 분할 정복을 통한 거듭제곱
    val result = pow(matrix, b)

    // result
    val sb = StringBuilder()
    for (i in 0 until n) {
        for (j in 0 until n) {
            sb.append(result[i][j]).append(" ")
        }
        sb.append("\n")
    }
    print(sb)
}

// 행렬 거듭제곱 함수 (분할 정복)
fun pow(a: Array<IntArray>, exponent: Long): Array<IntArray> {
    // 지수 = 1
    if (exponent == 1L) {
        return a
    }

    // 지수를 절반으로 나누어 재귀 호출
    val temp = pow(a, exponent / 2)

    // temp * temp 계산
    val res = multiply(temp, temp)

    // 지수 = 홀수 -> 원래 행렬 A를 한 번 더 곱해줌
    if (exponent % 2 == 1L) {
        return multiply(res, a)
    }

    return res
}

// 두 행렬을 곱하는 함수
fun multiply(o1: Array<IntArray>, o2: Array<IntArray>): Array<IntArray> {
    val result = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            var sum = 0
            for (k in 0 until n) {
                // C[i][j] += A[i][k] * B[k][j]
                sum += (o1[i][k] * o2[k][j])
            }
            result[i][j] = sum % MOD
        }
    }
    return result
}