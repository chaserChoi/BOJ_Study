import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            if (line.equals("0")) break;

            int decimal = factorialBaseToDec(line);
            bw.write(decimal + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static int factorialBaseToDec(String num) {
        int decimal = 0;
        int len = num.length();

        for (int i = 0; i < len; i++) {
            int digit = num.charAt(len - i - 1) - '0';
            decimal += digit * factorial(i + 1);
        }

        return decimal;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}
