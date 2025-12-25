import java.io.BufferedReader
import java.io.InputStreamReader

// 트리 노드 클래스
class Node(val key: Int) {
    var left: Node? = null
    var right: Node? = null
    
    // 트리에 노드 삽입하는 메서드
    fun insert(value: Int) {
        if (value < this.key) {
            // 현재 값보다 작으면 => 왼쪽
            if (this.left == null) {
                this.left = Node(value)
            } else {
                this.left!!.insert(value)
            }
        } else {
            // 현재 값보다 크면 => 오른쪽
            if (this.right == null) {
                this.right = Node(value)
            } else {
                this.right!!.insert(value)
            }
        }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    // 첫 번째 줄: 루트 
    var line = br.readLine()
    if (line == null || line.isEmpty()) return
    
    val root = Node(line.toInt())
    
    // 나머지 입력 -> 트리 삽입
    while (true) {
        line = br.readLine()
        if (line == null || line.isEmpty()) break
        
        root.insert(line.toInt())
    }
    
    // 후위 순회
    postOrder(root)
}

// 후위 순회: left -> right -> root
fun postOrder(node: Node?) {
    if (node == null) return
    
    postOrder(node.left) // 왼쪽 서브트리
    postOrder(node.right) // 오른쪽 서브트리
    println(node.key) // 루트(현재 노드) 출력
}

