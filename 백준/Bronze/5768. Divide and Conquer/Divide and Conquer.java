import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int MAX = 5000;
        int[] divisors = new int[MAX + 1];

        for (int i = 1; i <= MAX; i++) {
            for (int j = i; j <= MAX; j += i)
                divisors[j]++;
        }

        while (true) {
            String[] input = br.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);

            if (m == 0 && n == 0) break;

            int max = 0;
            int bestX = 0;

            for (int x = m; x <= n; x++) {
                int y = divisors[x];
                if (y > max || (y == max && x > bestX)) {
                    max = y;
                    bestX = x;
                }
            }

            bw.write(bestX + " " + max + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
