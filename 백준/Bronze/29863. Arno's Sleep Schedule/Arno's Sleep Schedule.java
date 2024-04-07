import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sleepTime = Integer.parseInt(br.readLine());
        int wakeUpTime = Integer.parseInt(br.readLine());

        int sleepDuration;
        if (wakeUpTime >= sleepTime) sleepDuration = wakeUpTime - sleepTime;
        else sleepDuration = (24 - sleepTime) + wakeUpTime;

        bw.write(String.valueOf(sleepDuration));

        bw.flush();
        bw.close();
        br.close();
    }
}
