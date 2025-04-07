import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken()) - 1;
            double b = Double.parseDouble(st.nextToken());

            st = new StringTokenizer(br.readLine());
            double c = Double.parseDouble(st.nextToken()) - 1;
            double d = Double.parseDouble(st.nextToken());

            double result = calcEit(a, b, c, d);
            System.out.printf("%.4f\n", result);
        }
    }

    private static double calcEit(double a, double b, double c, double d) {
        if (b != d)
            return d - b - 0.5 + c / 12;
        if (a != c)
            return (c - a) / (12 - a) / 2;
        return 0.0;
    }
}
