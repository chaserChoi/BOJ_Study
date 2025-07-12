package lec01

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t1 = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val t2 = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    val ok = isRightTriangle(t1.copyOf()) && isRightTriangle(t2.copyOf())
            && abs(triangleArea(t1.copyOf()) - triangleArea(t2.copyOf())) < 1e-8

    print(if (ok) "YES" else "NO")
}

fun isRightTriangle(t : IntArray) : Boolean {
    t.sort()
    return t[0] * t[0] + t[1] * t[1] == t[2] * t[2]
}

fun triangleArea(t : IntArray) : Double {
    t.sort()
    return t[0] * t[1] / 2.0
}
