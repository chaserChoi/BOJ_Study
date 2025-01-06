import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1000; i <= 9999; i++) {
            int sumDec = digitSum(i);
            int sumBase12 = digitSumBase12(i);
            int sumBase16 = digitSumBase16(i);

            if (sumDec == sumBase12 && sumBase12 == sumBase16)
                bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static int digitSumBase12(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 12;
            n /= 12;
        }
        return sum;
    }

    private static int digitSumBase16(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 16;
            n /= 16;
        }
        return sum;
    }
}
