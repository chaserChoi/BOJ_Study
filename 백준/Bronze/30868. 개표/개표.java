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

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n / 5; j++) sb.append("++++ ");

            for (int j = 0; j < n % 5; j++) sb.append("|");

            bw.write(sb.toString());
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
