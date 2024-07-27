import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            String s = line[0];
            String f = line[1];
            int k = Integer.parseInt(line[2]);

            int t = getTime(s, f) / 60;

            if (t >= k)
                bw.write("Perfect\n");
            else {
                t += 60;
                bw.write(t >= k ? "Test\n" : "Fail\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int getTime(String a, String b) {
        int ah = Integer.parseInt(a.substring(0, 2));
        int am = Integer.parseInt(a.substring(3, 5));
        int as = Integer.parseInt(a.substring(6, 8));

        int bh = Integer.parseInt(b.substring(0, 2));
        int bm = Integer.parseInt(b.substring(3, 5));
        int bs = Integer.parseInt(b.substring(6, 8));

        int h = bh - ah;
        int m = bm - am;
        int s = bs - as;

        if (s < 0) {
            s += 60;
            m--;
        }
        if (m < 0) {
            m += 60;
            h--;
        }
        if (h < 0) {
            h += 24;
        }

        return h * 3600 + m * 60 + s == 0 ? 86400 : h * 3600 + m * 60 + s;
    }
}
