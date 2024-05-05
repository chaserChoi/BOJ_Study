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

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int maxWeight = 0;

            for (int j = 0; j < 5; j++) {
                int weight = Integer.parseInt(st.nextToken());
                maxWeight = Math.max(maxWeight, weight);
            }

            bw.write("Case #" + i + ": " + maxWeight + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
