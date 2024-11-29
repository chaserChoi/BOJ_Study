import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            int l = sc.nextInt();
            int h = sc.nextInt();
            int a = sc.nextInt();
            int m = sc.nextInt();

            if (n == 0 && w == 0 && l == 0 && h == 0 && a == 0 && m == 0) break;

            int ans = w * l * n + 2 * (w + l) * h * n;

            while (m-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                ans -= x * y * n;
            }

            System.out.println((ans + a - 1) / a);
        }

        sc.close();
    }
}
