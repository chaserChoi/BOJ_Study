import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int paid = Integer.parseInt(br.readLine());

        int change = 1000 - paid;

        int[] coins = {500, 100, 50, 10, 5, 1};
        int cnt = 0;

        for (int c : coins) {
            if (change == 0) break;
            cnt += change / c;
            change %= c;
        }

        System.out.println(cnt);
    }
}
