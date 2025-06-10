import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] board = new int[502][502];
    static boolean[][] visited = new boolean[502][502];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        for (int i = 0; i < w; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < h; j++)
                board[i][j] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int num = 0;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (board[i][j] == 0 || visited[i][j])
                    continue;

                num++;
                int area = 0;

                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[]{i, j});
                visited[i][j] = true;

                while (!q.isEmpty()) {
                    area++;
                    int[] curr = q.poll();
                    int x = curr[0];
                    int y = curr[1];

                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        if (nx < 0 || nx >= w || ny < 0 || ny >= h)
                            continue;
                        if (visited[nx][ny] || board[nx][ny] != 1)
                            continue;

                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }

                max = Math.max(max, area);
            }
        }

        bw.write(num + "\n" + max + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
