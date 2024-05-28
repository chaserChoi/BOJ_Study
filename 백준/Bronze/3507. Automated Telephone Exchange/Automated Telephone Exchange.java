import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int luckyNumbersCount = 0;

        for (int i = 0; i <= 99; i++) {
            for (int j = 0; j <= 99; j++) {
                if (n - i - j == 0) luckyNumbersCount++;
            }
        }

        bw.write(Integer.toString(luckyNumbersCount));

        br.close();
        bw.flush();
        bw.close();
    }
}
