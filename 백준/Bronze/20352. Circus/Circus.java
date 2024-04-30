import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(br.readLine());

        double radius = Math.sqrt(a / Math.PI);

        double circumference = 2 * Math.PI * radius;

        bw.write(String.format("%.10f", circumference));

        bw.flush();
        br.close();
        bw.close();
    }
}
