import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            double value = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();

            switch (unit) {
                case "kg":
                    double pounds = value * 2.2046;
                    bw.write(String.format("%.4f lb\n", pounds));
                    break;
                case "lb":
                    double kilograms = value * 0.4536;
                    bw.write(String.format("%.4f kg\n", kilograms));
                    break;
                case "l":
                    double gallons = value * 0.2642;
                    bw.write(String.format("%.4f g\n", gallons));
                    break;
                case "g":
                    double liters = value * 3.7854;
                    bw.write(String.format("%.4f l\n", liters));
                    break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
