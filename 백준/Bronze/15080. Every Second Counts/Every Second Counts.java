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
        StringTokenizer st = new StringTokenizer(br.readLine(), " : ");

        int startHour = Integer.parseInt(st.nextToken());
        int startMinute = Integer.parseInt(st.nextToken());
        int startSecond = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " : ");
        int endHour = Integer.parseInt(st.nextToken());
        int endMinute = Integer.parseInt(st.nextToken());
        int endSecond = Integer.parseInt(st.nextToken());

        int startTimeInSeconds = startHour * 3600 + startMinute * 60 + startSecond;
        int endTimeInSeconds = endHour * 3600 + endMinute * 60 + endSecond;

        int timeDifference = endTimeInSeconds - startTimeInSeconds;

        if (timeDifference < 0) timeDifference += 24 * 3600;

        bw.write(String.valueOf(timeDifference));

        bw.flush();
        br.close();
        bw.close();
    }
}
