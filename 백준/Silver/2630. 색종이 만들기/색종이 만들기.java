import java.io.*;
import java.util.*;

public class Main {
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                paper[i][j] = Integer.parseInt(line[j]);
        }

        divideNCnt(paper, 0, 0, n);

        pw.println(white);
        pw.println(blue);

        pw.flush();
        pw.close();
        br.close();
    }

    static void divideNCnt(int[][] paper, int x, int y, int s) {
        if (isSame(paper, x, y, s)) {
            if (paper[x][y] == 0)
                white++;
            else
                blue++;
            return;
        }

        int newS = s / 2;
        divideNCnt(paper, x, y, newS);
        divideNCnt(paper, x, y + newS, newS);
        divideNCnt(paper, x + newS, y, newS);
        divideNCnt(paper, x + newS, y + newS, newS);
    }

    static boolean isSame(int[][] paper, int x, int y, int s) {
        int color = paper[x][y];
        for (int i = x; i < x + s; i++) {
            for (int j = y; j  < y + s; j++)
                if (paper[i][j] != color)
                    return false;
        }

        return true;
    }
}
