class Solution
{
    public int solution(int [][]board)
    {
        int maxLen = 0;
        int rows = board.length;
        int cols = board[0].length;
        
        // 예외 처리 & 초기화
        for (int i = 0; i < rows; i++) { 
            // 첫 번째 열 & 첫 번째 행에 1 하나라도 존재한다면, 
            if (board[i][0] == 1) {
                maxLen = 1; // 최소 한 변 길이 = 1
                break;
            }
        }
        // 아직 1 발견 X,
        if (maxLen == 0) { 
            // 첫 번째 행 검사 
            for (int j = 0; j < cols; j++) {
                if (board[0][j] == 1) {
                    maxLen = 1;
                    break;
                }
            }
        }
        
        // DP
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                // 현재 위치 = 1
                if (board[i][j] == 1) {
                    // 정사각형 만들기 가능
                    // 왼쪽, 위, 좌상단 중 가장 작은 값 + 1 => 현재 위치
                    int min = Math.min(board[i - 1][j - 1], Math.min(board[i - 1][j], board[i][j - 1]));
                    board[i][j] = min + 1;
                    
                    maxLen = Math.max(maxLen, board[i][j]);
                }
            }
        }
        
        return maxLen * maxLen;
    }
}