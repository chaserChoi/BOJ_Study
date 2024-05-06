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

        if (n >= 5) bw.write("0");
        else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
                factorial %= 10;
            }
            bw.write(String.valueOf(factorial));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
