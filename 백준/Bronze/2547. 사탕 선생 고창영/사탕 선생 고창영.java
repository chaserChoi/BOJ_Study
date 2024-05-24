import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); 

        while (T-- > 0) {
            br.readLine();

            int N = Integer.parseInt(br.readLine());
            BigInteger totalCandies = new BigInteger("0");

            for (int i = 0; i < N; i++) {
                BigInteger candies = new BigInteger(br.readLine());
                totalCandies = totalCandies.add(candies);
            }

            if (totalCandies.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO)) {
                bw.write("YES\n");
            } else bw.write("NO\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
