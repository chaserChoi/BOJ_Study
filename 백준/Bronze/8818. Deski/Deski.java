import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int z = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < z; i++) {
            long k = Long.parseLong(br.readLine());

            if (k == (k & -k)) {
                sb.append("0\n");
                continue;
            }

            int a = Long.numberOfTrailingZeros(k);
            int b = 0;

            while (k >> b > 0)
                b++;

            sb.append(b - a).append("\n");
        }

        System.out.println(sb);
    }
}
