import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] grid = new int[9][9];
        int maxVal = Integer.MIN_VALUE;
        int maxRow = -1;
        int maxCol = -1;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
                if (grid[i][j] > maxVal) {
                    maxVal = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        bw.write(maxVal + "\n");
        bw.write((maxRow + 1) + " " + (maxCol + 1) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
