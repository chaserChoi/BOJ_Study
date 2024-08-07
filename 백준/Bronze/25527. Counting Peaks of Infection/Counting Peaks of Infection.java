import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String[] cases = br.readLine().split(" ");
            int[] pos = new int[n];
            for (int i = 0; i < n; i++)
                pos[i] = Integer.parseInt(cases[i]);

            int cnt = 0;

            for (int i = 1; i < n - 1; i++) {
                if (pos[i] > pos[i - 1] && pos[i] > pos[i + 1])
                    cnt++;
            }

            sb.append(cnt).append("\n");
        }

        pw.println(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
