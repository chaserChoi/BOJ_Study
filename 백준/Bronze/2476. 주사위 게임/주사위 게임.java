import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int maxPrize = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int prize = 0;

            if (a == b && b == c) prize = 10000 + a * 1000;
            else if (a == b || a == c) prize = 1000 + a * 100;
            else if (b == c) prize = 1000 + b * 100;
            else prize = Math.max(a, Math.max(b, c)) * 100;

            if (prize > maxPrize) maxPrize = prize;
        }

        bw.write(String.valueOf(maxPrize));

        br.close();
        bw.flush();
        bw.close();
    }
}
