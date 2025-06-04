import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1)
                        bw.write("*");
                    else
                        bw.write(" ");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 1)
                        bw.write(" ");
                    else
                        bw.write("*");
                }
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
