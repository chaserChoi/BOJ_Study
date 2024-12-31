import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] inputs = br.readLine().split(" ");
            int m = Integer.parseInt(inputs[0]);
            int n = Integer.parseInt(inputs[1]);
            int x = Integer.parseInt(inputs[2]);
            int y = Integer.parseInt(inputs[3]);

            int ans = findYear(m, n, x, y);
            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }

    private static int findYear(int m, int n, int x, int y) {
        int year = x;
        while (year <= m * n) {
            if (year % n == y % n)
                return year;
            year += m;
        }
        return -1;
    }
}
