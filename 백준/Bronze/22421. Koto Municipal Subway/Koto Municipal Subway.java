import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while (true) {
            line = br.readLine();
            String[] parts = line.split(" ");
            int d = Integer.parseInt(parts[0]);
            int e = Integer.parseInt(parts[1]);

            if (d == 0 && e == 0)
                break;

            double minDiff = Double.MAX_VALUE;

            for (int i = 0; i <= d; i++) {
                int y = d - i;
                double cost = Math.sqrt(i * i + y * y);
                double diff = Math.abs(cost - e);
                minDiff = Math.min(minDiff, diff);
            }

            bw.write(String.format("%.10f\n", minDiff));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
