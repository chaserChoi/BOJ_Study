import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int t = 0; t < 3; t++) {
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < N; i++) sum = sum.add(new BigInteger(br.readLine()));

            if (sum.compareTo(BigInteger.ZERO) == 0) bw.write("0\n");
            else if (sum.compareTo(BigInteger.ZERO) > 0) bw.write("+\n");
            else bw.write("-\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
