import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] prices = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) prices[i] = Integer.parseInt(st.nextToken());

        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i < N - 1; i++) {
            int cost = (prices[i] + prices[i+1]) * X;
            if (cost < minCost) minCost = cost;
        }

        bw.write(String.valueOf(minCost));

        bw.flush();
        br.close();
        bw.close();
    }
}
