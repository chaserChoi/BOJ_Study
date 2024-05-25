import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tripCount = 1;
        String input;
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            double diameter = Double.parseDouble(st.nextToken());
            int revolutions = Integer.parseInt(st.nextToken());
            double timeInSeconds = Double.parseDouble(st.nextToken());

            if (revolutions == 0) break;

            double distanceInMiles = (diameter * Math.PI * revolutions) / (5280 * 12);
            double speedInMilesPerHour = distanceInMiles / (timeInSeconds / 3600);

            bw.write(String.format("Trip #%d: %.2f %.2f\n", tripCount++, distanceInMiles, speedInMilesPerHour));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
