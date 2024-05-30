import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double prevTemp = Double.parseDouble(br.readLine());
        while (true) {
            double currTemp = Double.parseDouble(br.readLine());
            if (currTemp == 999) break;
            bw.write(String.format("%.2f", currTemp - prevTemp) + "\n");
            prevTemp = currTemp;
        }

        bw.flush();
        bw.close();
        br.close(); 
    }
}
