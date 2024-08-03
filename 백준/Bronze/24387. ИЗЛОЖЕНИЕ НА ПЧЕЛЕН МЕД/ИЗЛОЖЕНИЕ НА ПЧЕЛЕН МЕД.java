import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        long[] a = new long[3];
        long[] b = new long[3];

        String[] prices = br.readLine().trim().split(" ");
        for (int i = 0; i < 3; i++)
            a[i] = Long.parseLong(prices[i]);

        String[] capas = br.readLine().trim().split(" ");
        for (int i = 0; i < 3; i++)
            b[i] = Long.parseLong(capas[i]);

        Arrays.sort(a);
        Arrays.sort(b);

        long max = a[0] * b[0] + a[1] * b[1] + a[2] * b[2];

        pw.println(max);

        pw.flush();
        pw.close();
        br.close();
    }
}
