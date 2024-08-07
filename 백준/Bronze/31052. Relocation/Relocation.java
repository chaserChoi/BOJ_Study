import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int q = Integer.parseInt(first[1]);

        int[] locations = new int[n + 1];
        String[] init = br.readLine().split(" ");

        for (int i = 1; i <= n; i++)
            locations[i] = Integer.parseInt(init[i - 1]);

        for (int i = 0; i < q; i++) {
            String[] request = br.readLine().split(" ");
            int t = Integer.parseInt(request[0]);

            if (t == 1) {
                int c = Integer.parseInt(request[1]);
                int x = Integer.parseInt(request[2]);
                locations[c] = x;
            } else if (t == 2) {
                int a = Integer.parseInt(request[1]);
                int b = Integer.parseInt(request[2]);
                int dist = Math.abs(locations[a] - locations[b]);
                sb.append(dist).append("\n");
            }
        }

        pw.println(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
