import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double mpg = Double.parseDouble(br.readLine());

        double lPer100km = (100 * 3.785411784) / (mpg * 1.609344);

        bw.write(String.format("%.6f", lPer100km));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
