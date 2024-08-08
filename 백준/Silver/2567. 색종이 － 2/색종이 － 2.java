import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++)
                    paper[j][k] = true;
            }
        }

        int peri = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    if (i == 0 || !paper[i - 1][j]) peri++;
                    if (i == 99 || !paper[i + 1][j]) peri++;
                    if (j == 0 || !paper[i][j - 1]) peri++;
                    if (j == 99 || !paper[i][j + 1]) peri++;
                }
            }
        }

        pw.println(peri);

        pw.flush();
        pw.close();
        br.close();
    }
}
