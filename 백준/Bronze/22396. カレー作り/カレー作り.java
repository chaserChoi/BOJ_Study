import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while (true) {
            line = br.readLine();
            String[] parts = line.split(" ");
            int r0 = Integer.parseInt(parts[0]);
            int w0 = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);
            int r = Integer.parseInt(parts[3]);

            if (r0 == 0 && w0 == 0 && c == 0 && r == 0)
                break;

            bw.write((w0 * c > r0 ? (w0 * c - r0 + r - 1) / r : 0) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
