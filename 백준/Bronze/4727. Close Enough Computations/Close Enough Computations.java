import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            double a = Double.parseDouble(parts[0]);
            double b = Double.parseDouble(parts[1]);
            double c = Double.parseDouble(parts[2]);
            double d = Double.parseDouble(parts[3]);

            if (a == 0 && b == 0 && c == 0 && d == 0) break;

            double l = 9 * Math.max(b - 0.5, 0.0) + 4 * (Math.max(c - 0.5, 0.0) + Math.max(d - 0.5, 0.0));
            double r = 9 * (b + 0.5) + 4 * (c + 0.5 + d + 0.5);

            System.out.println((l <= a && a <= r) ? "yes" : "no");
        }
    }
}
