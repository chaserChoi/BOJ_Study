import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long area = Long.parseLong(br.readLine());

        double sideLength = Math.sqrt(area);

        double perimeter = 4 * sideLength;

        bw.write(String.format("%.6f", perimeter));

        br.close();
        bw.flush();
        bw.close();
    }
}
