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
            double earthWeight = Double.parseDouble(br.readLine());
            if (earthWeight < 0) break;
            double moonWeight = earthWeight * 0.167;

            bw.write(String.format("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", earthWeight, moonWeight));
        }

        br.close();
        bw.flush();
        bw.close(); 
    }
}
