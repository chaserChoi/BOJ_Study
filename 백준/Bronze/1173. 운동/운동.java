import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int M = Integer.parseInt(line[2]);
        int t = Integer.parseInt(line[3]);
        int r = Integer.parseInt(line[4]);

        int mix = m;
        int cnt = 0;

        if((M - m) < t) {
            pw.println(-1);
        } else {
            while(true) {
                if((m + t) <= M) {
                    m += t;
                    n--;
                } else
                    m -= r;

                if(m < mix)
                    m = mix;

                cnt++;

                if(n == 0)
                    break;
            }

            pw.println(cnt);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
