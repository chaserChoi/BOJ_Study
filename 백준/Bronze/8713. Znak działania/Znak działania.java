import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int add = a + b;
        int sub = a - b;
        int mul = a * b;

        if (add == sub || add == mul || sub == mul)
            System.out.println("NIE");
        else {
            if (add >= sub && add >= mul)
                System.out.printf("%s+%s=%s\n", format(a), format(b), format(add));
            else if (sub >= add && sub >= mul)
                System.out.printf("%s-%s=%s\n", format(a), format(b), format(sub));
            else
                System.out.printf("%s*%s=%s\n", format(a), format(b), format(mul));
        }
    }

    private static String format(int n) {
        return n < 0 ? "(" + n + ")" : String.valueOf(n);
    }
}
