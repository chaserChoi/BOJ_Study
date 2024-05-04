import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A1 = Integer.parseInt(br.readLine());
        int A2 = Integer.parseInt(br.readLine());
        int A3 = Integer.parseInt(br.readLine());

        int time1 = (A2 * 2) + (A3 * 4);
        int time2 = (A1 * 2) + (A3 * 2);
        int time3 = (A1 * 4) + (A2 * 2);
        int minTime = Math.min(Math.min(time1, time2), time3);

        bw.write(String.valueOf(minTime));
        bw.newLine();

        br.close();
        bw.close();
    }
}
