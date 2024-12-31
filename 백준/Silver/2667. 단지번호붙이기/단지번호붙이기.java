import java.io.*;
import java.util.*;

public class Main {
    private static int n;
    private static int[][] map;
    private static boolean[][] visited;
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++)
                map[i][j] = line.charAt(j) - '0';
        }

        ArrayList<Integer> houseCnt = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j])
                    houseCnt.add(bfs(i, j));
            }
        }

        System.out.println(houseCnt.size());
        Collections.sort(houseCnt);
        for (int cnt : houseCnt) {
            System.out.println(cnt);
        }
    }

    private static int bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        int houseCnt = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            houseCnt++;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        return houseCnt;
    }
}
