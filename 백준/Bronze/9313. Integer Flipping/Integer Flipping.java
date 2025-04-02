import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            long n = Long.parseLong(br.readLine());
            if (n == -1)
                break;

            long result = 0;

            for (int i = 0; i < 32; i++)
                result = (result << 1) | ((n & (1L << i)) >> i);

            System.out.println(result);
        }
    }
}
