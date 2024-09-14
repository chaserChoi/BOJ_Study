import java.io.*;
import java.util.*;

public class Main {
    static int m, n;
    static int[][] box;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        box = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1)
                    q.offer(new int[]{i, j});
            }
        }

        int days = bfs(q);

        pw.println(days);

        pw.flush();
        pw.close();
        br.close();
    }

    static int bfs(Queue<int[]> q) {
        int days = -1;

        while (!q.isEmpty()) {
            int s = q.size();
            days++;

            for (int i = 0; i < s; i++) {
                int[] curr = q.poll();
                int x = curr[0];
                int y = curr[1];

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0)
                    return -1;
            }
        }

        return days == -1 ? 0 : days;
    }
}
