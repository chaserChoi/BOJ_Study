import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        char[][] v = new char[m][n];
        for (int i = 0; i < m; i++) {
            v[i] = br.readLine().toCharArray();
        }

        double ans = 0.0;
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                int sum = 0, cnt = 0;

                for (int i = 0; i < 4; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];

                    if (ny < 0 || ny >= m || nx < 0 || nx >= n) continue;

                    sum += Math.abs(v[y][x] - v[ny][nx]);
                    cnt++;
                }
                ans += (double) sum / cnt;
            }
        }

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(ans));
    }
}
