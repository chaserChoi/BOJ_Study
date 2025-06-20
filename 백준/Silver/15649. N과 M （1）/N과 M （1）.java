import java.io.*;

public class Main {

    static int N, M;
    static boolean[] visited;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        visited = new boolean[N + 1];
        result = new int[M];

        permu(0);

        System.out.print(sb);
    }

    static void permu(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++)
                sb.append(result[i]).append(' ');
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i;
                permu(depth + 1);
                visited[i] = false;
            }
        }
    }
}
