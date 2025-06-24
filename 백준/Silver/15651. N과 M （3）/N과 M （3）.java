import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        backtrack(0);
        System.out.println(sb);

        br.close();
    }

    static void backtrack(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++)
                sb.append(arr[i] + " ");
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i + 1;
            backtrack(depth + 1);
        }
    }
}
