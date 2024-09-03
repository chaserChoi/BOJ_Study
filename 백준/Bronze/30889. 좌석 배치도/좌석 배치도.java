import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        boolean[][] seats = new boolean[10][20];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char rowS = s.charAt(0);
            int r = rowS - 'A';
            int c = Integer.parseInt(s.substring(1)) - 1;
            seats[r][c] = true;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (seats[i][j])
                    pw.print('o');
                else
                    pw.print('.');
            }
            pw.println();
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
