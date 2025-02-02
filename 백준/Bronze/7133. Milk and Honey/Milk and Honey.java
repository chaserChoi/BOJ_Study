import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] milk = br.readLine().split(" ");
        int m = Integer.parseInt(milk[0]);
        int d_m = Integer.parseInt(milk[1]);

        String[] honey = br.readLine().split(" ");
        int h = Integer.parseInt(honey[0]);
        int d_h = Integer.parseInt(honey[1]);

        int n = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            String[] field = br.readLine().split(" ");
            int c = Integer.parseInt(field[0]);
            int b = Integer.parseInt(field[1]);

            int happinessCows = calc(m, d_m, c);
            int happinessBees = calc(h, d_h, b);

            total += Math.max(happinessCows, happinessBees);
        }

        System.out.println(total);
    }

    private static int calc(int init, int dec, int cnt) {
        int total = 0;
        for (int i = 0; i < cnt; i++) {
            int curr = init - i * dec;
            if (curr > 0)
                total += curr;
            else
                break;
        }
        return total;
    }
}
