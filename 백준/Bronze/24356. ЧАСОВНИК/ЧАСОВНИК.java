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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());

        int startMinutes = t1 * 60 + m1;
        int endMinutes = t2 * 60 + m2;

        if (endMinutes < startMinutes) endMinutes += 24 * 60;

        int elapsedTime = endMinutes - startMinutes;

        int fullLaps = elapsedTime / 30;

        bw.write(elapsedTime + " " + fullLaps);
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }
}
