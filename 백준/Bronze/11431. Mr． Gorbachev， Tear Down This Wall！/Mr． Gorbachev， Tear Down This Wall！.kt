import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.ceil

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val k = br.readLine().toInt()
    for (i in 1..k) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val s = st.nextToken().toInt()
        val p = st.nextToken().toInt()

        val point = Array(n + 1) { IntArray(2) }
        for (j in 0..n) {
            val pt = StringTokenizer(br.readLine())
            point[j][0] = pt.nextToken().toInt()
            point[j][1] = pt.nextToken().toInt()
        }

        var total = 0
        for (j in 0 until n) 
            total += abs(point[j][0] - point[j + 1][0]) + abs(point[j][1] - point[j + 1][1])

        val hours = total * s.toDouble() / p
        val result = ceil(hours).toInt()

        sb.append("Data Set $i:\n")
        sb.append("$result\n\n")
    }
    print(sb)
}