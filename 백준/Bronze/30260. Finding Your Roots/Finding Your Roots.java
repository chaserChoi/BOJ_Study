import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        for (int i = 1; i <= k; i++) {
            String[] firLine = br.readLine().split(" ");
            int l = Integer.parseInt(firLine[0]);
            int n = Integer.parseInt(firLine[1]);

            String[] parents = br.readLine().split(" ");
            int[] parent = new int[n + 1];

            for (int j = 1; j <= n; j++)
                parent[j] = Integer.parseInt(parents[j - 1]);

            HashSet<Integer> ancestry = new HashSet<>();
            int curr = l;

            while (curr != 0 && !ancestry.contains(curr)) {
                ancestry.add(curr);
                curr = parent[curr];
            }

            pw.println("Data Set " + i + ":");
            pw.println(ancestry.size());
            pw.println();
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
