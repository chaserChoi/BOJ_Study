import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long sum = 0;

        while (true) {
            int money = Integer.parseInt(br.readLine());
            if (money == -1) break;
            sum += money;
        }

        bw.write(String.valueOf(sum));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
