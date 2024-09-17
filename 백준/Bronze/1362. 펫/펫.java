import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int num = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if (o == 0 && w == 0) break;

            int cnt = 0;

            while (true) {
                st = new StringTokenizer(br.readLine());
                String cmd = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if (cmd.equals("#") && n == 0) break;

                if (cmd.equals("E")) w -= n;
                if (cmd.equals("F")) w += n;

                if (w <= 0)
                    cnt = 1;
            }

            if (cnt == 1)
                System.out.println(num + " RIP");
            else {
                if ((o / 2) < w && w < (o * 2))
                    System.out.println(num + " :-)");
                else
                    System.out.println(num + " :-(");
            }

            num++;
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
