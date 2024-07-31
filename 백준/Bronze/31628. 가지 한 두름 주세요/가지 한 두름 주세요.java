import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[][] grid = new String[10][10];

        for (int i = 0; i < 10; i++)
            grid[i] = br.readLine().split(" ");

        for (int i = 0; i < 10; i++) {
            if (checkRow(grid, i)) {
                pw.println(1);
                pw.flush();
                return;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (checkCol(grid, i)) {
                pw.println(1);
                pw.flush();
                return;
            }
        }

        pw.println(0);

        pw.flush();
        pw.close();
        br.close();
    }

    private static boolean checkRow(String[][] grid, int row) {
        String firstColor = grid[row][0];
        for (int col = 1; col < 10; col++) {
            if (!grid[row][col].equals(firstColor))
                return false;
        }
        return true;
    }

    private static boolean checkCol(String[][] grid, int col) {
        String firstColor = grid[0][col];
        for (int row = 1; row < 10; row++) {
            if (!grid[row][col].equals(firstColor))
                return false;
        }
        return true;
    }
}
