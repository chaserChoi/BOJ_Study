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

        int K = Integer.parseInt(br.readLine());

        for (int i = 1; i <= K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int totalDucats = 0;

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int distance = Integer.parseInt(st.nextToken());
                int value = Integer.parseInt(st.nextToken());

                if (distance <= s * d) totalDucats += value;
            }

            bw.write("Data Set " + i + ":\n");
            bw.write(totalDucats + "\n\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
