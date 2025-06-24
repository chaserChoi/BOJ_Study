import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        visited = new boolean[n];

        backtrack(0, 0);
        System.out.println(sb);

        br.close();
    }

    static void backtrack(int depth, int start) {
        if (depth == m) {
            for (int i = 0; i < m; i++)
                sb.append(arr[i] + " ");
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                backtrack(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}
