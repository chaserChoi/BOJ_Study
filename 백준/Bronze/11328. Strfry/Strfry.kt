import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val t = br.readLine().toInt()
    repeat(t) {
        val (s1, s2) = br.readLine().split(" ")
        sb.append(if (isPossible(s1, s2)) "Possible\n" else "Impossible\n")
    }
    print(sb)
}

fun isPossible(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) return false

    val cnt = IntArray(26)

    for (c in s1) cnt[c - 'a']++
    for (c in s2) cnt[c - 'a']--

    return cnt.all { it == 0 }
}