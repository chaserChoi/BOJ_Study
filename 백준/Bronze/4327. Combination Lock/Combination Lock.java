import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a == 0 && b == 0 && c == 0 & d == 0)
                break;

            int ans = 1080 + calc(a, b) + calc(c, b) + calc(c, d);
            System.out.println(ans);
        }

        sc.close();
    }

    private static int calc(int a, int b) {
        return ((a - b + 40) % 40) * 9;
    }
}
