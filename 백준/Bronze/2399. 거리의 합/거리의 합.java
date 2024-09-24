import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        long[] x = new long[n];

        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++)
            x[i] = Long.parseLong(line[i]);

        Arrays.sort(x);

        long total = 0;

        for (int i = 0; i < n; i++)
            total += x[i] * ((2 * i) - (2 * (n - i - 1)));

        pw.println(total);

        pw.flush();
        pw.close();
        br.close();
    }
}
