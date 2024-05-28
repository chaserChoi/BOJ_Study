import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine());

        double euclidean = Math.PI * R * R;
        double taxi = 2.0 * R * R;

        bw.write(String.format("%.6f\n", euclidean));
        bw.write(String.format("%.6f\n", taxi));

        bw.flush();
        br.close();
        bw.close();
    }
}
