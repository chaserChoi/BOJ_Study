import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String expr = br.readLine();
        String[] parts = expr.split("-");

        int ans = calc(parts[0]);

        for (int i = 1; i < parts.length; i++)
            ans -= calc(parts[i]);

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }

    private static int calc(String part) {
        int sum = 0;
        String[] nums = part.split("\\+");
        for (String num : nums)
            sum += Integer.parseInt(num);

        return sum;
    }
}
