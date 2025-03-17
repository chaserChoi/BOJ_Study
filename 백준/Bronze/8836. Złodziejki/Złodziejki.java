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
            long k = Long.parseLong(input[1]);

            long available = 1;
            long add = 0;

            while (available < n) {
                add++;
                available += (k - 1);
            }

            long remain = available - n;
            sb.append(remain).append("\n");
        }

        System.out.print(sb);
    }
}
