import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] line = br.readLine().split(" ");
        int h = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int s = Integer.parseInt(line[2]);

        s++;

        if (s == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24)
            h = 0;

        pw.printf("%02d:%02d:%02d%n", h, m, s);

        pw.flush();
        pw.close();
        br.close();
    }
}
