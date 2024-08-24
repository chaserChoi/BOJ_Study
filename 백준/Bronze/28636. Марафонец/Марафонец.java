import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            String[] time = br.readLine().split(":");
            int tm = Integer.parseInt(time[0]);
            int ts = Integer.parseInt(time[1]);
            total += (tm * 60) + ts;
        }

        int h = total / 3600;
        int m = (total % 3600) / 60;
        int s = total % 60;

        pw.printf("%02d:%02d:%02d\n", h, m, s);

        pw.flush();
        pw.close();
        br.close();
    }
}
