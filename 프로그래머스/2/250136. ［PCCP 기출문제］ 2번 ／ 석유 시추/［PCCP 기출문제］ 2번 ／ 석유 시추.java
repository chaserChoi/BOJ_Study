import java.util.*;

class Solution {
    public int solution(int[][] land) {
        int n = land.length;
        int m = land[0].length;
        
        boolean[][] visited = new boolean[n][m]; // 방문 여부 
        
        int[] oilPerColumn = new int[m]; // 열마다 시추관 뚫었을 때 얻을 수 있는 총 석유량 누적 
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        // 석유 덩어리 찾기 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 방문하지 않은 석유(= 1) 만나면 
                if (land[i][j] == 1 && !visited[i][j]) {
                    int size = 0;
                    Set<Integer> columns = new HashSet<>();
                    Queue<int[]> queue = new LinkedList<>();
                    
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                    
                    // bfs
                    while (!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int r = curr[0];
                        int c = curr[1];
                        
                        size++;
                        columns.add(c);
                        
                        for (int d = 0; d < 4; d++) {
                            int nr = r + dr[d];
                            int nc = c + dc[d];
                            
                            // 격자 범위 벗어나지 않고, 방문하지 않은 석유 칸인 경우 
                            if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                                if (land[nr][nc] == 1 && !visited[nr][nc]) {
                                    visited[nr][nc] = true;
                                    queue.offer(new int[]{nr, nc});
                                }
                            }
                        }
                    }
                    
                    // 탐색 끝난 덩어리 크기 
                    for (int col : columns) {
                        oilPerColumn[col] += size;
                    }
                }
            }
        }
        
        int maxOil = 0;
        for (int i = 0; i < m; i++) {
            if (oilPerColumn[i] > maxOil) {
                maxOil = oilPerColumn[i];
            }
        }
        
        return maxOil;
        
    }
}