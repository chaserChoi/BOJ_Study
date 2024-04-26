import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] rates = br.readLine().split(" ");
        int rate1 = Integer.parseInt(rates[0]);
        int rate2 = Integer.parseInt(rates[1]);

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int consumption = Integer.parseInt(br.readLine());
            int bill;

            if (consumption <= 1000) bill = consumption * rate1;
            else bill = 1000 * rate1 + (consumption - 1000) * rate2;

            bw.write(consumption + " " + bill + "\n"); 
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
