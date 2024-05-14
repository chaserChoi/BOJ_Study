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

        int[] prices = new int[N + 1];

        for (int i = 1; i <= N; i++) prices[i] = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());

        int totalCost = 0;

        for (int i = 0; i < M; i++) {
            int cornerNumber = Integer.parseInt(br.readLine());
            totalCost += prices[cornerNumber];
        }

        bw.write(String.valueOf(totalCost));

        bw.flush();
        bw.close();
        br.close();
    }
}
