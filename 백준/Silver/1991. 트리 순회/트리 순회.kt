import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

/**
 * 노드 데이터 클래스
 * left: 왼쪽 자식 정보
 * right: 오른쪽 자식 정보
 * */
data class Node(var left: Char, var right: Char)

// 트리 저장할 배열 (A ~ Z)
val tree = Array(26) { Node('.', '.') }
val sb = StringBuilder()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    
    val n = br.readLine().toInt()
    
    // tree
    repeat(n) {
        val line = br.readLine()
        val root = line[0]
        val left = line[2]
        val right = line[4]
        
        // 문자 -> 인덱스
        val index = root - 'A'
        tree[index].left = left
        tree[index].right = right
    }
    
    // 1. preorder
    preorder('A')
    sb.append("\n")
    
    // 2. Inorder
    inorder('A')
    sb.append("\n")
    
    // 3. postorder
    postorder('A')
    
    println(sb)
}

// 전위 순회 메서드: root -> left -> right
fun preorder(node: Char) {
    if (node == '.') return
    
    sb.append(node) // root 방문
    preorder(tree[node - 'A'].left) // 왼쪽 서브트리 순회
    preorder(tree[node - 'A'].right) // 오른쪽 서브트리 순회
}

// 중위 순회 메서드: left -> root -> right
fun inorder(node: Char) {
    if (node == '.') return
    
    inorder(tree[node - 'A'].left) // 왼쪽 서브트리 순회
    sb.append(node) // root 방문
    inorder(tree[node - 'A'].right) // 오른쪽 서브트리 순회
}

// 후위 순회 메서드: left -> right -> root
fun postorder(node: Char) {
    if (node == '.') return
    
    postorder(tree[node - 'A'].left) // 왼쪽 서브트리 순회
    postorder(tree[node - 'A'].right) // 오른쪽 서브트리 순회
    sb.append(node) // root 방문
}