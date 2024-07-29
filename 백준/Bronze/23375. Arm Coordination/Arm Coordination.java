import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);

        int r = Integer.parseInt(br.readLine());

        int x1 = x + r;
        int y1 = y + r;
        int x2 = x - r;
        int y2 = y - r;

        bw.write(x1 + " " + y1 + "\n");
        bw.write(x2 + " " + y1 + "\n");
        bw.write(x2 + " " + y2 + "\n");
        bw.write(x1 + " " + y2 + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
