import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int y = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int d = Integer.parseInt(input[2]);

            int days = calcMillennium(1000, 1, 1) - calcMillennium(y, m, d);
            System.out.println(days);
        }
    }

    private static int calcMillennium(int y, int m, int d) {
        int a = (y - 1) * 195 + (y - 1) / 3 * 5;
        int b = (m - 1) * 20 - (y % 3 != 0 ? (m - 1) / 2 : 0);
        return a + b + d;
    }
}
