import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        long totalTime = 0L;
        long increment = 30L;

        for (int i = 1; i <= k; i++) {
            totalTime += increment;
            if (i % 5 == 0) increment += 30;
        }

        bw.write(String.valueOf(totalTime));

        bw.flush();
        bw.close();
        br.close();
    }
}
