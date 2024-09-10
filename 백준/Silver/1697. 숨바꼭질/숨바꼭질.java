import java.io.*;
import java.util.*;


// BOJ 1697 숨바꼭질

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        pw.println(bfs(n, k));

        pw.flush();
        pw.close();
        br.close();
    }

    private static int bfs(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[100001];
        q.add(n);
        visited[n] = 1;

        while (!q.isEmpty()) {
            int x = q.poll();
            if (x == k) {
                return visited[x] - 1;
            }
            if (x - 1 >= 0 && visited[x - 1] == 0) {
                q.add(x - 1);
                visited[x - 1] = visited[x] + 1;
            }
            if (x + 1 <= 100000 && visited[x + 1] == 0) {
                q.add(x + 1);
                visited[x + 1] = visited[x] + 1;
            }
            if (x * 2 <= 100000 && visited[x * 2] == 0) {
                q.add(x * 2);
                visited[x * 2] = visited[x] + 1;
            }
        }
        return -1;
    }
}
