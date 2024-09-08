import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long[] trees = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            trees[i] = Long.parseLong(st.nextToken());

        long l = 0;
        long r = 1000000000;
        long ans = 0;

        while (l <= r) {
            long mid = (l + r) / 2;
            long total = 0;

            for (long t : trees) {
                if (t > mid)
                    total += t - mid;
            }

            if (total >= m) {
                ans = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}
