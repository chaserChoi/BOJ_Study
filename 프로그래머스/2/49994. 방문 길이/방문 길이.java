class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        boolean[][][][] visited = new boolean[11][11][11][11]; // 경로 방문 여부 
        
        // 처음 캐릭터 위치 (0, 0)
        int currX = 5;
        int currY = 5;
        
        for (char dir : dirs.toCharArray()) {
            int nextX = currX;
            int nextY = currY;
            
            if (dir == 'U') {
                nextY++;
            } else if (dir == 'D') {
                nextY--;
            } else if (dir == 'R') {
                nextX++;
            } else if (dir == 'L') {
                nextX--;
            }
            
            // 좌표 평면 경계 벗어나는 경우
            if (nextX < 0 || nextX > 10 || nextY < 0 || nextY > 10) {
                continue;
            }
            
            // 처음 걸어보는 길인지 확인
            if (!visited[currX][currY][nextX][nextY]) {
                visited[currX][currY][nextX][nextY] = true; // 정방향
                visited[nextX][nextY][currX][currY] = true; // 역방향 
                answer++;
            }
            
            currX = nextX;
            currY = nextY;
        }
        
        return answer;
    }
}