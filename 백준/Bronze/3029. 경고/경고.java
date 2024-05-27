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

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int currentHour = Integer.parseInt(st.nextToken());
        int currentMinute = Integer.parseInt(st.nextToken());
        int currentSecond = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");
        int targetHour = Integer.parseInt(st.nextToken());
        int targetMinute = Integer.parseInt(st.nextToken());
        int targetSecond = Integer.parseInt(st.nextToken());

        int currentTimeInSec = currentHour * 3600 + currentMinute * 60 + currentSecond;
        int targetTimeInSec = targetHour * 3600 + targetMinute * 60 + targetSecond;

        int waitTimeInSec = targetTimeInSec - currentTimeInSec;
        if (waitTimeInSec <= 0) waitTimeInSec += 24 * 3600;

        int waitHours = waitTimeInSec / 3600;
        waitTimeInSec %= 3600;
        int waitMinutes = waitTimeInSec / 60;
        int waitSeconds = waitTimeInSec % 60;

        bw.write(String.format("%02d:%02d:%02d\n", waitHours, waitMinutes, waitSeconds));

        bw.flush();
        br.close();
        bw.close();
    }
}
