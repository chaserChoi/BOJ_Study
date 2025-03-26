import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;

            int result = 0;
            for (int i = 0; cubic(i) <= n; i++) {
                for (int j = 0; cubic(i) + tetra(j) <= n ; j++)
                    result = Math.max(result, cubic(i) + tetra(j));
            }
            sb.append(result).append("\n");
        }
        
        System.out.print(sb);
    }

    private static int cubic(int x) {
        return x * x * x;
    }

    private static int tetra(int x) {
        return x * (x + 1) * (x + 2) / 6;
    }
}
