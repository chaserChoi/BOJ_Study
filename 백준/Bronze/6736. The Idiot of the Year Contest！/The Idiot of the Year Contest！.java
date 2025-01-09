import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int dayOfYear = Integer.parseInt(input[0]);
            char digit = input[1].charAt(0);

            BigInteger factorial = calcFactorial(dayOfYear);

            int cnt = countDigitOccurrences(factorial.toString(), digit);
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }

    private static BigInteger calcFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        return factorial;
    }

    private static int countDigitOccurrences(String num, char digit) {
        int cnt = 0;
        for (char c : num.toCharArray()) {
            if (c == digit) cnt++;
        }
        return cnt;
    }
}

