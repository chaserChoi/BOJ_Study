import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split("-");
        int y = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int d = Integer.parseInt(line[2]);

        int n = Integer.parseInt(br.readLine());

        d += n;

        while (d > 30) {
            d -= 30;
            m++;
            if (m > 12) {
                m = 1;
                y++;
            }
        }

        pw.printf("%04d-%02d-%02d\n", y, m, d);

        pw.flush();
        pw.close();
        br.close();
    }
}
