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

        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) T[i] = Integer.parseInt(st.nextToken());

        int totalTime = 0;
        for (int i = 0; i < N; i++) {
            totalTime += T[i];
            if (i < N - 1) totalTime += 8;
        }

        int days = totalTime / 24;
        int hours = totalTime % 24;

        bw.write(days + " " + hours);

        bw.flush();
        br.close();
        bw.close();
    }
}
