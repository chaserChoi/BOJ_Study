import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val ops = Array(n) {
        val st = StringTokenizer(br.readLine())
        Pair(st.nextToken(), st.nextToken().toInt())
    }
    var messed = 0
    for (k in 1..100) {
        var value = k
        var fail = false
        for ((op, x) in ops) {
            when (op) {
                "ADD" -> value += x
                "SUBTRACT" -> {
                    value -= x
                    if (value < 0) {
                        fail = true
                        break
                    }
                }
                "MULTIPLY" -> value *= x
                "DIVIDE" -> {
                    if (value % x != 0) {
                        fail = true
                        break
                    }
                    value /= x
                }
            }
            if (value < 0) {
                fail = true
                break
            }
        }
        if (fail) messed++
    }
    println(messed)
}
