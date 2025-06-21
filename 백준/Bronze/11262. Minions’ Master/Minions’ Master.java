import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[] powers = new int[n];
            int sum = 0;

            for (int j = 0; j < n; j++) {
                powers[j] = Integer.parseInt(st.nextToken());
                sum += powers[j];
            }

            BigDecimal avg = new BigDecimal(sum).divide(new BigDecimal(n), 3, RoundingMode.HALF_UP);

            int cnt = 0;
            for (int p : powers) {
                if (new BigDecimal(p).compareTo(avg) > 0)
                    cnt++;
            }

            BigDecimal percent = new BigDecimal(cnt)
                    .multiply(new BigDecimal("100"))
                    .divide(new BigDecimal(n), 3, RoundingMode.HALF_UP);

            sb.append(avg.setScale(3, RoundingMode.HALF_UP)).append(" ");
            sb.append(percent.setScale(3, RoundingMode.HALF_UP)).append("%\n");
        }

        System.out.println(sb);

        br.close();
    }
}