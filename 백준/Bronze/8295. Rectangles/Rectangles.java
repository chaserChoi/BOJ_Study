import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int p = Integer.parseInt(input[2]);

        int cnt = 0;

        for (int x1 = 1; x1 <= n; x1++) {
            for (int x2 = x1; x2 <= n; x2++) {
                for (int y1 = 1; y1 <= m; y1++) {
                    for (int y2 = y1; y2 <= m; y2++) {
                        int peri = 2 * ((x2 - x1 + 1) + (y2 - y1 + 1));
                        if (peri >= p)
                            cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
