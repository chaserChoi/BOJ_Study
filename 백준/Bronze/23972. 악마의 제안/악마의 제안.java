import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        long k = Long.parseLong(line[0]);
        long n = Long.parseLong(line[1]);

        if (n == 1)
            pw.println(-1);
        else {
            long x = (k * n) / (n - 1);
            if ((k * n) % (n - 1) != 0) x++;
            pw.println(x);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
