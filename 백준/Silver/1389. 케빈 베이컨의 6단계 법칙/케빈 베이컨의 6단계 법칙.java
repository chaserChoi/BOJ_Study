import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            String[] relation = br.readLine().split(" ");
            int a = Integer.parseInt(relation[0]);
            int b = Integer.parseInt(relation[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int[] kevin = new int[n + 1];

        for (int i = 1; i <= n; i++)
            kevin[i] = bfs(graph, i, n);

        int minScore = Integer.MAX_VALUE;
        int minUser = 0;
        for (int i = 1; i <= n; i++) {
            if (kevin[i] < minScore) {
                minScore = kevin[i];
                minUser = i;
            }
        }

        System.out.println(minUser);
    }

    private static int bfs(List<List<Integer>> graph, int start, int n) {
        boolean[] visited = new boolean[n + 1];
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        dist[start] = 0;
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int neighbor : graph.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    dist[neighbor] = dist[curr] + 1;
                    q.add(neighbor);
                }
            }
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i != start)
                sum += dist[i];
        }

        return sum;
    }
}
