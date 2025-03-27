import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int t = 1; ; t++) {
            String[] parts = br.readLine().split(" ");
            int p = Integer.parseInt(parts[0]);
            int e = Integer.parseInt(parts[1]);
            int i = Integer.parseInt(parts[2]);
            int d = Integer.parseInt(parts[3]);

            if (p == -1 && e == -1 && i == -1 && d == -1)
                break;

            int cycleP = 23;
            int cycleE = 28;
            int cycleI = 33;
            int cycleLcm = cycleP * cycleE * cycleI;
            int nextPeak = 0;

            for (nextPeak = d + 1; nextPeak < d + cycleLcm; nextPeak++) {
                if ((nextPeak - p) % cycleP == 0 && (nextPeak - e) % cycleE == 0 && (nextPeak - i) % cycleI == 0)
                    break;
            }

            sb.append("Case ").append(t).append(": the next triple peak occurs in ").append(nextPeak - d).append(" days.\n");
        }

        System.out.print(sb);
    }
}
