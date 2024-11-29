import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String n = sc.next();
            if (n.equals("0")) break;

            long ans = 0;
            int len = n.length();
            for (int i = len - 1; i >= 0; i--)
                ans += (n.charAt(i) - '0') * ((1L << (len - i)) - 1);
            System.out.println(ans);
        }

        sc.close();
    }
}
