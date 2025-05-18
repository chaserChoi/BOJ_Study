import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] b = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            b[i] = Integer.parseInt(st.nextToken());

        int[] a = new int[n];

        a[0] = b[0];

        for (int i = 1; i < n; i++) {
            long sum1 = (long) b[i] * (i + 1);
            long sum2 = (long) b[i - 1] * i;

            a[i] = (int) (sum1 - sum2);
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(a[i]));
            if (i < n - 1)
                bw.write(" ");
        }
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}