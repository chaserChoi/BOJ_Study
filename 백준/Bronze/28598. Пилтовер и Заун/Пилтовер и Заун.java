import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x1 = Long.parseLong(st.nextToken());
        long x2 = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        long delta = x1 - x2;

        if (delta < 0) {
            pw.println("NO");
            pw.flush();
            return;
        }
        if (delta == 0) {
            pw.println(n == 0 ? "YES" : "NO");
            pw.flush();
            return;
        }
        if (delta / 2 < n || delta % 2 != 0) {
            pw.println("NO");
            pw.flush();
            return;
        }

        pw.println("YES");

        pw.flush();
        pw.close();
        br.close();
    }
}
