import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while (!(input = br.readLine()).equals("00:00 00:00")) {
            StringTokenizer st = new StringTokenizer(input, " ");
            String[] startTime = st.nextToken().split(":");
            String[] durationTime = st.nextToken().split(":");

            int startH = Integer.parseInt(startTime[0]);
            int startMin = Integer.parseInt(startTime[1]);
            int durationH = Integer.parseInt(durationTime[0]);
            int durationMin = Integer.parseInt(durationTime[1]);

            int endMin = startMin + durationMin;
            int endH = startH + durationH + endMin / 60;
            endMin %= 60;

            int daysLater = endH / 24;
            endH %= 24;

            if (daysLater > 0) bw.write(String.format("%02d:%02d +%d\n", endH, endMin, daysLater));
            else bw.write(String.format("%02d:%02d\n", endH, endMin));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
