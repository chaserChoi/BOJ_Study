import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        int[] ans = new int[t];

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;

            for (int j = 2; j <= n; j++) {
                int cnt = 0;
                int num = n;

                while (num % j == 0) {
                    cnt++;
                    num /= j;
                }

                sum += cnt;
            }
            ans[i] = sum;
        }

        StringBuilder sb = new StringBuilder();
        for (int a : ans)
            sb.append(a).append("\n");
        pw.println(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
