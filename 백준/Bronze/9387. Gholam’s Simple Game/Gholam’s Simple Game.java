import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int[] tiles = new int[m];
            st = new StringTokenizer(br.readLine());
            int start = -1;
            int direction = 0;
            for (int j = 0; j < m; j++) {
                tiles[j] = Integer.parseInt(st.nextToken());
                if (tiles[j] == 2) {
                    start = j;
                    direction = 0;
                } else if (tiles[j] == 3) {
                    start = j;
                    direction = 1;
                }
            }

            int curr = start;
            int yellow = 0;
            for (int j = 0; j < n; j++) {
                if (tiles[curr] == 0)
                    yellow++;

                if (direction == 0) {
                    if (curr == m - 1) {
                        direction = 1;
                        curr--;
                    } else
                        curr++;
                } else {
                    if (curr == 0) {
                        direction = 0;
                        curr++;
                    } else
                        curr--;
                }
            }

            if (tiles[curr] == 0)
                yellow++;

            System.out.println(yellow);
        }
    }
}
