import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int a = 100 - x;
        int b = 100 - y;

        int c = 100 - (a + b);
        int d = a * b;

        int q = d / 100;
        int r = d % 100;

        bw.write(a + " " + b + " " + c + " " + d + " " + q + " " + r + "\n");
        bw.write(c + q + " ");
        bw.write(r + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
