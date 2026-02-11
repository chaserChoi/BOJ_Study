import java.util.Stack

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val basket = Stack<Int>() // 바구니
        
        // 크레인 이동 
        for (move in moves) {
            val col = move - 1
            
            for (row in board.indices) {
                if (board[row][col] != 0) { // 인형이 있는 경우
                    val pickedDoll = board[row][col]
                    board[row][col] = 0
                    
                    // 바구니가 비어있지 않고, 맨 위의 인형이 현재 집은 인형과 같다면 
                    if (basket.isNotEmpty() && basket.peek() == pickedDoll) { 
                        basket.pop()
                        answer += 2
                    } else {
                        basket.push(pickedDoll)
                    }
                    
                    break
                }
            }
        }
        
        return answer
    }
}