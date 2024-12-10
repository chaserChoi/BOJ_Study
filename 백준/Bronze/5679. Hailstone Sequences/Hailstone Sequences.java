import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int h = Integer.parseInt(br.readLine());
            if (h == 0) break;

            int ans = h;
            while (h != 1) {
                if ((h & 1) == 1)
                    h = 3 * h + 1;
                else
                    h >>= 1;
                ans = Math.max(ans, h);
            }
            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
