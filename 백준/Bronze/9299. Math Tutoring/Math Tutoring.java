import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int num = Integer.parseInt(st.nextToken());

            int[] coefficients = new int[num + 1];
            for (int j = 0; j <= num; j++)
                coefficients[j] = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            int newN = num - 1;

            if (newN < 0)
                sb.append("0");
            else {
                sb.append(newN);
                for (int j = 0; j < num; j++)
                    sb.append(" ").append(coefficients[j] * (num - j));
            }

            System.out.println("Case " + i + ": " + sb.toString());
        }
    }
}
