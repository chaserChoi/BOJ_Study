import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        double perimeter = 2 * d1 + 2 * Math.PI * d2;

        bw.write(String.format("%.6f", perimeter));

        bw.flush();
        br.close();
        bw.close();
    }
}
