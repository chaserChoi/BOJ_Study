import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            for(int k = 1; k <= n; k++) sum += k * (k + 1) * (k + 2) / 2;

            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
