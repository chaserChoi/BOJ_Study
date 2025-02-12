import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int ans = 1;
            for (int i = 1; i <= n; i++) {
                ans *= i;
                while (ans % 10 == 0)
                    ans /= 10;
                ans %= 100000;
            }
            System.out.println(ans % 10);
        }
    }
}
