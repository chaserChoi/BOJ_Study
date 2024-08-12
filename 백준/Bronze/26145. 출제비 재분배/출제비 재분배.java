import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] s = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            s[i] = Integer.parseInt(st.nextToken());

        int[][] t = new int[n][n + m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n + m; j++)
                t[i][j] = Integer.parseInt(st.nextToken());
        }

        int[] ans = new int[n + m];

        for (int i = 0; i < n; i++)
            ans[i] = s[i];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + m; j++) {
                ans[j] += t[i][j];
                ans[i] -= t[i][j];
            }
        }

        for (int amount : ans)
            sb.append(amount).append(" ");
        
        System.out.println(sb.toString().trim());

        pw.flush();
        pw.close();
        br.close();
    }
}
