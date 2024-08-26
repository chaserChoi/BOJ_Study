import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int h = Integer.parseInt(line[2]);
        int w = Integer.parseInt(line[3]);

        int hPlates = (int) Math.ceil((double) h / a);
        int wPlates = (int) Math.ceil((double) w / b);

        int total = hPlates * wPlates;

        pw.println(total);

        pw.flush();
        pw.close();
        br.close();
    }
}
