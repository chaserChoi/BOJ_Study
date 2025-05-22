import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            String num = st.nextToken();
            int divisor = Integer.parseInt(st.nextToken());

            int remainder = 0;

            for (int j = 0; j < num.length(); j++) {
                int digit = num.charAt(j) - '0';

                remainder = (remainder * 10 + digit) % divisor;
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Case ").append(i + 1).append(": ").append(remainder);

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
