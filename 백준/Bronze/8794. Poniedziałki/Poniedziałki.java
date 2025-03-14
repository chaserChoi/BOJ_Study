import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int z = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < z; i++) {
            String[] input = br.readLine().split(" ");
            long n = Long.parseLong(input[0]);
            long m = Long.parseLong(input[1]);
            long l = Long.parseLong(input[2]);

            long firstMon = (l == 1) ? 1 : (m - (l - 1) % m) % m + 1;

            long total = (n - firstMon) / m + 1;
            if (firstMon > n)
                total = 0;


            sb.append(total).append("\n");
        }

        System.out.println(sb);
    }
}
