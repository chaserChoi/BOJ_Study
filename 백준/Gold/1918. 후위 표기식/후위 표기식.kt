import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val expression = br.readLine()
    val sb = StringBuilder()
    val stack = Stack<Char>()

    for (char in expression) {
        when (char) {
            // 피연산자 -> 바로 출력
            in 'A'..'Z' -> sb.append(char)

            // 여는 괄호 -> 스택 push
            '(' -> stack.push(char)

            // 닫는 괄호 -> 여는 괄호가 나올 때 까지 pop & 출력
            ')' -> {
                while (stack.isNotEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop())
                }
                // 여는 괄호 제거
                if (stack.isNotEmpty()) stack.pop()
            }

            // 연산자 처리
            else -> {
                // 연산자보다 우선순위 높거나 같은 연산자가 스택 top에 있다면
                while (stack.isNotEmpty() && getPriority(stack.peek()) >= getPriority(char)) {
                    sb.append(stack.pop())
                }
                // 현재 연산자
                stack.push(char)
            }
        }
    }

    // 스택 남은 연산자들 모두 꺼내서 출력
    while (stack.isNotEmpty()) {
        sb.append(stack.pop())
    }

    println(sb)
}

/**
 * 연산자 우선순위 변환
 */
fun getPriority(op: Char): Int {
    return when (op) {
        '*', '/' -> 2
        '+', '-' -> 1
        '(' -> 0 // 스택 안에서는 가장 낮은 우선순위
        else -> -1
    }
}
