import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] weights = new int[n];
            for (int j = 0; j < n; j++)
                weights[j] = Integer.parseInt(st.nextToken());

            Arrays.sort(weights);

            int boiled = 0;
            int total = 0;
            for (int j = 0; j < n; j++) {
                if (boiled < p && total + weights[j] <= q) {
                    total += weights[j];
                    boiled++;
                } else
                    break;
            }

            System.out.println("Case " + i + ": " + boiled);
        }
    }
}
