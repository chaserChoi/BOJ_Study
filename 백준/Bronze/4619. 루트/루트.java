import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] input = br.readLine().split(" ");
            int B = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);

            if (B == 0 && N == 0) break;

            int A = (int) Math.pow(B, 1.0 / N);
            int diff1 = Math.abs(B - (int) Math.pow(A, N));
            int diff2 = Math.abs(B - (int) Math.pow(A + 1, N));

            if (diff1 > diff2) bw.write((A + 1) + "\n");
            else bw.write(A + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
