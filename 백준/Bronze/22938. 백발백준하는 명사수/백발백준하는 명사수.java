import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstCir = br.readLine().split(" ");
        long x1 = Long.parseLong(firstCir[0]);
        long y1 = Long.parseLong(firstCir[1]);
        long r1 = Long.parseLong(firstCir[2]);

        String[] secCir = br.readLine().split(" ");
        long x2 = Long.parseLong(secCir[0]);
        long y2 = Long.parseLong(secCir[1]);
        long r2 = Long.parseLong(secCir[2]);

        bw.write((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) < (r1 + r2) * (r1 + r2) ? "YES" : "NO");

        bw.flush();
        bw.close();
        br.close();
    }
}
