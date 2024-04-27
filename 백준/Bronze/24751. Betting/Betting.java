import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = Double.parseDouble(br.readLine());
        double optionOnePayoutRatio = 100 / a;
        double optionTwoPayoutRatio = 100 / (100 - a);

        bw.write(String.format("%.10f\n%.10f\n", optionOnePayoutRatio, optionTwoPayoutRatio));

        bw.flush();
        bw.close();
        br.close();
    }
}
