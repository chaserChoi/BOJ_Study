import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n ; i++)
            tree.add(new ArrayList<>());

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        int[] parent = new int[n + 1];
        boolean[] visited = new boolean[n + 1];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int next : tree.get(now)) {
                if (!visited[next]) {
                    parent[next] = now;
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }

        for (int i = 2; i <= n; i++)
            sb.append(parent[i]).append("\n");

        System.out.println(sb);

        br.close();
    }
}
