import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long[] str = new long[n];

        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++)
            str[i] = Long.parseLong(line[i]);

        long k = Arrays.stream(str).sum() / 2;

        for (int i = 0; i < n; i++) {
            if (str[i] != k)
                sb.append(str[i]).append(" ");
        }
        sb.append(k);

        pw.println(sb.toString().trim());

        pw.flush();
        pw.close();
        br.close();
    }
}
