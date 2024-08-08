import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        double curV = 0.0;

        String[] line = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int a_i = Integer.parseInt(line[i]);
            curV = 1 - (1 - curV) * (1 - a_i / 100.0);
            sb.append(String.format("%.6f\n", curV * 100));
        }

        pw.println(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
