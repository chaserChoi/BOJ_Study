import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        int x = Integer.parseInt(first[0]);
        int y = Integer.parseInt(first[1]);
        int l = Integer.parseInt(first[2]);

        boolean[][] field = new boolean[x+1][y+1];

        for (int i = 0; i < l; i++) {
            String[] cmd = br.readLine().split(" ");
            int xll = Integer.parseInt(cmd[0]);
            int yll = Integer.parseInt(cmd[1]);
            int xur = Integer.parseInt(cmd[2]);
            int yur = Integer.parseInt(cmd[3]);

            for (int j = xll; j <= xur; j++) {
                for (int k = yll; k <= yur; k++)
                    field[j][k] = true;
            }
        }

        int cnt = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (field[i][j]) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
