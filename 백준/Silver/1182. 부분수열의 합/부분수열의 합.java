import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, s;
    static int[] arr;
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        dfs(0, 0);
        if (s == 0)
            sb.append(cnt - 1);
        else
            sb.append(cnt);

        System.out.println(sb);

        br.close();
    }

    static void dfs(int depth, int sum) {
        if (depth == n) {
            if (sum == s)
                cnt++;
            return;
        }

        dfs(depth + 1, sum + arr[depth]);
        dfs(depth + 1, sum);
    }
}
