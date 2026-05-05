class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }
        
        // 지울 블록 없을 때까지
        while (true) {
            boolean[][] checked = new boolean[m][n];
            boolean isFound = false; // 이번 턴에 지울 블록 있는지 확인
            
            // 2x2 블록 찾기
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = map[i][j];
                    // 빈 공간 -> pass
                    if (c == '-') continue;
                    
                    // 2x2 모두 같은 모양인지 확인
                    if (c == map[i][j + 1] && c == map[i + 1][j] && c == map[i + 1][j + 1]) {
                        checked[i][j] = true;
                        checked[i][j + 1] = true;
                        checked[i + 1][j] = true;
                        checked[i + 1][j + 1] = true;
                        isFound = true;
                    }
                }
            }
            
            // 더 이상 지울 블록 없다면
            if (!isFound) {
                break; // 종료 
            }
            
            // 표시된 블록들 지우기 & 세기
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (checked[i][j]) {
                        map[i][j] = '-'; // 빈 공간 
                        answer++;
                    }
                }
            }
            
            // 블록들 아래로 떨어뜨리기
            for (int j = 0; j < n; j++) {
                int emptyRow = m - 1; // 블록이 떨어질 수 있는 가장 밑바닥 행
                
                // 아래 -> 위로 올라가며 블록 찾기
                for (int i = m - 1; i >= 0; i--) {
                    // 빈 공간 아닌 블록 발견 시,
                    if (map[i][j] != '-') {
                        // 원래 위치가 떨어질 위치 아니라면, 
                        if (i != emptyRow) {
                            map[emptyRow][j] = map[i][j];
                            map[i][j] = '-';
                        }
                        emptyRow--; // 하나 채웠으므로 빈 공간 위치 한 칸 위로 올림
                    }
                }
            }
        }
        
        return answer;
    }
}