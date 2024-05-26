import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int totalDots = 0;

        for (int i = 0; i <= N; i++) {
            for (int j = i; j <= N; j++) totalDots += i + j;
        }

        bw.write(String.valueOf(totalDots));

        bw.flush();
        bw.close();
        br.close();
    }
}
