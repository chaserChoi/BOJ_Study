import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String P = input[0];
        int K = Integer.parseInt(input[1]);

        boolean isGood = true;
        int smallPrime = 0;

        for (int i = 2; i < K; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                BigInteger bigP = new BigInteger(P);
                BigInteger bigI = BigInteger.valueOf(i);
                if (bigP.mod(bigI).equals(BigInteger.ZERO)) {
                    isGood = false;
                    smallPrime = i;
                    break;
                }
            }
        }

        if (isGood) bw.write("GOOD\n");
        else bw.write("BAD " + smallPrime + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
