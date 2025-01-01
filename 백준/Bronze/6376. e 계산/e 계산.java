import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("n e");
        System.out.println("- -----------");
        System.out.println("0 1");

        double ans = 1.0;

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
            ans += 1 / calcE(i);

            if (i == 1)
                System.out.println(2);
            else if (i == 2)
                System.out.println("2.5");
            else
                System.out.printf("%.9f\n", ans);
        }
    }

    private static double calcE(int n) {
        double f = 1;
        for (double i = 2; i <= n; i++)
            f *= i;
        return f;
    }
}
