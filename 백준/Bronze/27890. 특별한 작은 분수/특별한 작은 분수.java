import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int x0 = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        int xt = x0;

        for (int t = 0; t < N; t++) {
            if (xt % 2 == 0) xt = (xt / 2) ^ 6;
            else xt = (2 * xt) ^ 6;
        }

        bw.write(String.valueOf(xt));

        bw.flush();
        br.close();
        bw.close();
    }
}
