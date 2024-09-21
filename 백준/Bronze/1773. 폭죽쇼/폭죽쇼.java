import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        boolean[] fire = new boolean[c + 1];
        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(br.readLine());
            for (int j = time; j <= c; j += time)
                fire[j] = true;
        }

        int cnt = 0;
        for (int i = 1; i <= c; i++)
            if (fire[i])
                cnt++;

        pw.print(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
