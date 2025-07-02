import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken()); // 목표 고객 수
        int n = Integer.parseInt(st.nextToken()); // 홀보할 수 있는 도시 개수
        int[] costs = new int[n]; // 홍보 비용
        int[] values = new int[n]; // 홍보로 얻을 수 있는 고객 수

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            costs[i] = Integer.parseInt(st.nextToken());
            values[i] = Integer.parseInt(st.nextToken());
        }

        int max = c + 100 * 100;
        int[] dp = new int[max + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = values[i]; j <= max; j++) {
                if (dp[j - values[i]] != Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[j], dp[j - values[i]] + costs[i]);
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = c; i < max; i++) {
            if (dp[i] < result)
                result = dp[i];
        }

        sb.append(result);
        System.out.println(sb);

        br.close();
    }
}
