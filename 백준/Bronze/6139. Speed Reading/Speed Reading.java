import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int k = Integer.parseInt(first[1]);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            String[] cowInfo = br.readLine().split(" ");
            int s = Integer.parseInt(cowInfo[0]);
            int t = Integer.parseInt(cowInfo[1]);
            int r = Integer.parseInt(cowInfo[2]);

            int pagesPerSet = s * t;
            int fullSets = n / pagesPerSet;
            int remaining = n % pagesPerSet;

            int total = 0;

            if (fullSets > 0) {
                total += fullSets * (t + r);
            }

            if (remaining > 0) {
                int add = (remaining + s - 1) / s;
                total += add;
            } else if (fullSets > 0) {
                total -= r;
            }

            ans[i] = total;
        }

        for (int a : ans) {
            System.out.println(a);
        }
    }
}
