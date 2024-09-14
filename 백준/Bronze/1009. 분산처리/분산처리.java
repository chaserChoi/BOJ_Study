import java.io.*;
import java.util.*;

// BOJ 1009번 분산처리

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            int num = getPCNumber(a, b);
            sb.append(num).append("\n");
        }

        pw.println(sb);

        pw.flush();
        pw.close();
        br.close();
    }

    private static int getPCNumber(int a, int b) {
        if (a % 10 == 0)
            return 10;

        int last = a % 10;

        int[] cycle = new int[4];
        for (int i = 1; i <= 4; i++)
            cycle[i - 1] = (int) Math.pow(last, i) % 10;

        if (b == 0)
            return 1;

        int idx = b % cycle.length - 1;
        if (idx < 0)
            idx += cycle.length;

        return cycle[idx];
    }
}
