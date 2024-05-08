import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while ((line = br.readLine()) != null) {
            double n = Double.parseDouble(line);
            if (n == 0.0) break;
            double average = 1 + n + Math.pow(n, 2) + Math.pow(n, 3) + Math.pow(n, 4);

            bw.write(String.format("%.2f\n", average));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
