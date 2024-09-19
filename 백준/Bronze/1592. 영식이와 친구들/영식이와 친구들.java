import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int l = Integer.parseInt(line[2]);

        int[] cnts = new int[n + 1];
        int curr = 0;
        int cnt = 0;
        cnts[curr] = 1;

        while (cnts[curr] != m) {
            if (cnts[curr] % 2 == 1)
                curr = (curr + l) % n;
            else
                curr = ((curr - l) + n) % n;

            cnts[curr]++;
            cnt++;
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
