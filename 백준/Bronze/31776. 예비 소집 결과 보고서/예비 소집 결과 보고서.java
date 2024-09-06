import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        StringTokenizer st;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            int t3 = Integer.parseInt(st.nextToken());

            if (t1 != -1) {
                if (t2 == -1 && t3 == -1)
                    cnt++;
                else if (t2 != -1) {
                    if ((t1 <= t2) && (t3 == -1 || t2 <= t3))
                        cnt++;
                }
            }
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
