import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int h = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());

        int rad = Math.min(h, w);

        pw.print(rad / 2);
        pw.print(rad % 2 * 5);
        pw.print(0);
        pw.println();

        pw.flush();
        pw.close();
        br.close();
    }
}
