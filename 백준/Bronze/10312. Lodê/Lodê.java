import java.io.*;

public class Main {

    private static final long[] powersOf3 = new long[16];

    static {
        powersOf3[0] = 1;
        for (int i = 1; i < powersOf3.length; i++) {
            powersOf3[i] = powersOf3[i - 1] * 3;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            int[] counts = new int[16];

            for (int j = powersOf3.length - 1; j >= 0; j--) {
                long curr = powersOf3[j];

                if (k >= curr) {
                    int num = (int) (k / curr);
                    counts[j] = num;
                    k -= num * curr;
                }

                if (k == 0)
                    break;
            }

            int highest = counts.length - 1;
            while (highest >= 0 && counts[highest] == 0)
                highest--;

            StringBuilder sb = new StringBuilder();
            for (int j = highest; j >= 0; j--) {
                sb.append(counts[j]);

                if (j > 0)
                    sb.append(" ");
            }
            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}