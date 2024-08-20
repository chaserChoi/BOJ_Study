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
        String S = br.readLine();

        int cur = 1;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char move = S.charAt(i);

            if (move == 'L') {
                if (cur > 1)
                    cur--;
            } else if (move == 'R') {
                if (cur < 3)
                    cur++;
            }

            if (cur == 3)
                cnt++;
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
