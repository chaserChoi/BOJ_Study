import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    // 입력 & 폭발 문자열
    val inputStr = br.readLine()
    val bombStr = br.readLine()

    // 스택 역할
    val sb = StringBuilder()
    val bombLen = bombStr.length

    // 입력 문자열 순회 -> 하나씩 쌓기
    for (char in inputStr) {
        sb.append(char)

        // 폭발 문자열과 마지막 글자가 같을 때만 검사
        if (sb.length >= bombLen && char == bombStr.last()) {
            var isBomb = true

            // 뒤에서부터 폭발 문자열 길이만큼 비교 (sb 끝부분 <-> bombStr)
            for (i in 0 until bombLen) {
                if (sb[sb.length - bombLen + i] != bombStr[i]) {
                    isBomb = false
                    break
                }
            }

            // 폭발 문자열과 일치하면 sb에서 제거
            if (isBomb) {
                sb.setLength(sb.length - bombLen)
            }
        }
    }

    if (sb.isEmpty()) {
        println("FRULA")
    } else {
        println(sb)
    }
}
