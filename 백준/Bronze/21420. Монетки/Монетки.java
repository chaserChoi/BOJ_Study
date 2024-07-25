import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < n; i++) {
            int coin = Integer.parseInt(br.readLine());
            if (coin == 0)
                heads++;
            else
                tails++;
        }

        int ans = Math.min(heads, tails);

        bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();
        br.close();
    }
}
