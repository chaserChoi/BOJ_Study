import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr = new int[5][5];
    static Set<String> set = new HashSet<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                dfs(i ,j, 0, "" + arr[i][j]);
        }

        sb.append(set.size());
        System.out.println(sb);

        br.close();
    }

    static void dfs(int x, int y, int depth, String num) {
        if (depth == 5) {
            set.add(num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5)
                dfs(nx, ny, depth + 1, num + arr[nx][ny]);
        }
    }


}
