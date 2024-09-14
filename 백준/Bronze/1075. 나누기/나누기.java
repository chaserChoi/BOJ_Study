import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int base = n / 100 * 100;

        for (int i = 0; i < 100; i++) {
            if ((base + i) % f == 0) {
                pw.printf("%02d\n", i);
                break;
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
