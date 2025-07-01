import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*int n = 3;
        Solution s = new Solution();
        System.out.println(s.solution(n));*/

        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[n + 1];
        for (int i = 1; i <= n; i++)
            stairs[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        dp[1] = stairs[1]; // 초기값
        if (n >= 2)
            dp[2] = stairs[1] + stairs[2];

        // 점화식
        for (int i = 3; i <= n; i++)
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];

        System.out.println(sb.append(dp[n]));

        br.close();
    }
}