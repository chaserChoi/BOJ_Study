import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            int quarters = C / 25;
            C %= 25;
            int dimes = C / 10;
            C %= 10;
            int nickels = C / 5;
            C %= 5;
            int pennies = C;

            bw.write(quarters + " " + dimes + " " + nickels + " " + pennies + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
