import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] l = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                l[i][j] = (line.charAt(j) == '#') ? 1 : 0;
            }
        }

        for (int i = 0; i < n; i++) {
            int x = 0;
            int cnt = 0;

            for (int j = 0; j < m; j++) {
                if (l[i][j] == 1)
                    x++;
                else {
                    if (x > 0) {
                        System.out.print(x + " ");
                        cnt++;
                        x = 0;
                    }
                }
            }
            if (x > 0) {
                System.out.print(x + " ");
                cnt++;
            }
            if (cnt == 0)
                System.out.print(0);
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            int x = 0;
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (l[j][i] == 1)
                    x++;
                else {
                    if (x > 0) {
                        System.out.print(x + " ");
                        cnt++;
                        x = 0;
                    }
                }
            }
            if (x > 0) {
                System.out.print(x + " ");
                cnt++;
            }
            if (cnt == 0)
                System.out.print(0);
            System.out.println();
        }
    }
}
