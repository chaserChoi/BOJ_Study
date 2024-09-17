import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int d = Integer.parseInt(line[0]);
        int h = Integer.parseInt(line[1]);
        int w = Integer.parseInt(line[2]);

        double ratio = Math.sqrt(h * h + w * w);

        int height = (int) Math.floor(d * h / ratio);
        int width = (int) Math.floor(d * w / ratio);

        pw.println(height + " " + width);

        pw.flush();
        pw.close();
        br.close();
    }
}
