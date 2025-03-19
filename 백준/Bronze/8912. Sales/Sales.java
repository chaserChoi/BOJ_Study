import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] sales = new int[n];

            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                sales[j] = Integer.parseInt(input[j]);

            int total = 0;

            for (int j = 1; j < n; j++) {
                int cnt = 0;
                for (int k = 0; k < j; k++) {
                    if (sales[k] <= sales[j])
                        cnt++;
                }
                total += cnt;
            }

            sb.append(total).append("\n");
        }
        System.out.println(sb);
    }
}
