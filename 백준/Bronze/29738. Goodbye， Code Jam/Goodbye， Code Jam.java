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

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            String round = "";

            if (N <= 25) round = "World Finals";
            else if (N <= 1000) round = "Round 3";
            else if (N <= 4500) round = "Round 2";
            else round = "Round 1";

            bw.write("Case #" + t + ": " + round + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
