import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] line = br.readLine().split(" ");
            int l = Integer.parseInt(line[0]);
            int r = Integer.parseInt(line[1]);
            int s = Integer.parseInt(line[2]);

            l -= s;
            r -= s;
            s = 0;

            long ans = 2 * Math.min(r, -l) + (r > -l ? 1 : 0);

            pw.println(ans);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
