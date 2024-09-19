import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] tokens = line.split(" ");
            int n = Integer.parseInt(tokens[0]);
            int k = Integer.parseInt(tokens[1]);

            int total = 0;
            int stamps = 0;
            int coupons = n;

            while (coupons > 0) {
                total += coupons;
                stamps += coupons;
                coupons = 0;
                coupons += stamps / k;
                stamps %= k;
            }

            sb.append(total).append("\n");
        }

        pw.print(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
