import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        long k = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");

        long total = 0;
        long[] bills = new long[n];

        for (int i = 0; i < n; i++) {
            bills[i] = Long.parseLong(line[i]);
            total += bills[i];
        }

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            long remain = total - bills[i];
            if (remain >= k) {
                flag = false;
                break;
            }
        }

        if (flag)
            pw.println("NO");
        else
            pw.println("YES");

        pw.flush();
        pw.close();
        br.close();
    }
}
