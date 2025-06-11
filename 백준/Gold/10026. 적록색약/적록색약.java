import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static char[][] boardNormal;
    static char[][] boardColorBlind;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        boardNormal = new char[n][n];
        boardColorBlind = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                char c = line.charAt(j);
                boardNormal[i][j] = c;
                boardColorBlind[i][j] = (c == 'R') ? 'G' : c;
            }
        }

        visited = new boolean[n][n];
        int normalCnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, boardNormal);
                    normalCnt++;
                }
            }
        }

        visited = new boolean[n][n];
        int colorBlindCnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, boardColorBlind);
                    colorBlindCnt++;
                }
            }
        }

        bw.write(normalCnt + " " + colorBlindCnt + "\n");

        bw.flush();
        br.close();
        bw.close();
    }

    private static void bfs(int i, int j, char[][] board) {
        Queue<int[]> q = new LinkedList<>();
        visited[i][j] = true;
        q.offer(new int[]{i, j});
        char color = board[i][j];

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int cx = curr[0];
            int cy = curr[1];

            for (int k = 0; k < 4; k++) {
                int nx = cx + dx[k];
                int ny = cy + dy[k];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n)
                    continue;
                if (visited[nx][ny] || board[nx][ny] != color)
                    continue;

                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny});
            }
        }
    }
}
