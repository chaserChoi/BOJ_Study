import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int square = n * n;

            int l = String.valueOf(n).length();
            int last = square % (int) Math.pow(10, l);

            if (last == n)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        pw.print(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
