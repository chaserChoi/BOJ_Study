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
        int P = Integer.parseInt(br.readLine());

        int minCost = P;

        if (N >= 5) minCost = Math.min(minCost, P - 500);
        if (N >= 10) minCost = Math.min(minCost, (int)(P * 0.9));
        if (N >= 15) minCost = Math.min(minCost, P - 2000);
        if (N >= 20) minCost = Math.min(minCost, (int)(P * 0.75));

        minCost = Math.max(minCost, 0);

        bw.write(String.valueOf(minCost));

        bw.flush();
        bw.close();
        br.close();
    }
}
