import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i - 1);

            if (s.contains("50"))
                cnt += 2;
            else
                cnt++;
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
