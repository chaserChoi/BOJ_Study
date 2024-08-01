import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int h = Integer.parseInt(line[0]);
        int w = Integer.parseInt(line[1]);
        int n = Integer.parseInt(line[2]);
        int m = Integer.parseInt(line[3]);

        int vert = (h + n) / (n + 1);
        int horiz = (w + m) / (m + 1);

        int max = vert * horiz;

        pw.println(max);

        pw.flush();
        pw.close();
        br.close();
    }
}
