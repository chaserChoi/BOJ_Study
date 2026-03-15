class Solution {
    fun solution(board: Array<String>): Int {
        var oCount = 0
        var xCount = 0
        
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (board[i][j] == 'O') oCount++
                if (board[i][j] == 'X') xCount++
            }
        }
        
        // 기본 개수 규칙 위반 
        if (xCount > oCount || oCount > xCount + 1) {
            return 0
        }
        
        val oWins = checkWin(board, 'O')
        val xWins = checkWin(board, 'X')
        
        // 승리 규칙 위반 검사
        if (oWins && oCount == xCount) {
            return 0
        }
        if (xWins && oCount > xCount) {
            return 0
        }
        
        return 1
    }
    
    // 가로, 세로, 대각선 승리 조건 
    private fun checkWin(board: Array<String>, player: Char): Boolean {
        // 가로
        for (i in 0 until 3) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true 
        }
        // 세로
        for (i in 0 until 3) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true
        }
        // 대각선
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true 
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true 
        
        return false
    }
}