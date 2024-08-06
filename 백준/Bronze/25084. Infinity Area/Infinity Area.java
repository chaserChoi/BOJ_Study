import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]);

            double ans = 0.0;

            while (r >= 1) {
                ans += Math.PI * r * r;
                r *= a;
                ans += Math.PI * r * r;
                r /= b;
            }
            pw.printf("Case #%d: %.7f%n", i, ans);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
