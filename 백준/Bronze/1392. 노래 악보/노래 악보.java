import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int q = Integer.parseInt(line[1]);

        int[] b = new int[n];
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(br.readLine());
            times[i] = (i == 0 ? b[i] : times[i - 1] + b[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                if (t < times[j]) {
                    sb.append(j + 1).append("\n");
                    break;
                }
            }
        }

        pw.println(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
