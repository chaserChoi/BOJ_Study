import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int a = 0, b = 0;

        for (int i = 1; i <= 9; i++) {
            pw.println("? A " + i);
            pw.flush();
            int res = Integer.parseInt(br.readLine());
            if (res == 1) {
                a = i;
                break;
            }
        }

        for (int i = 1; i <= 9; i++) {
            pw.println("? B " + i);
            pw.flush();
            int res = Integer.parseInt(br.readLine());
            if (res == 1) {
                b = i;
                break;
            }
        }

        pw.println("! " + (a + b));

        pw.flush();
        pw.close();
        br.close();
    }
}
