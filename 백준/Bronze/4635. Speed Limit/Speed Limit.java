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

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            int totalDistance = 0;
            int prevTime = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int speed = Integer.parseInt(st.nextToken());
                int currTime = Integer.parseInt(st.nextToken());
                int elapsedTime = currTime - prevTime;

                totalDistance += speed * elapsedTime;

                prevTime = currTime;
            }

            bw.write(totalDistance + " miles\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
