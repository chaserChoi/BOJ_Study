import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int m = Integer.parseInt(br.readLine());

        int direction = 0;
        long rotate = 1;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            rotate = (rotate * b) / a;

            if (s == 1)
                direction = 1 - direction;
        }

        bw.write(direction + " " + rotate);
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}