import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            // 약수 구하기
            int[] divisors = new int[n];
            int sum = 0;
            int cnt = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    divisors[cnt] = i;
                    sum += i;
                    cnt++;
                }
            }

            // 완전수 판별
            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < cnt; i++) {
                    sb.append(divisors[i]);
                    if (i < cnt - 1)
                        sb.append(" + ");
                }
                sb.append("\n");
            } else
                sb.append(n).append(" is NOT perfect.\n");
        }
        System.out.println(sb);

        br.close();
    }
}
