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

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String id = st.nextToken();
            int[] scores = new int[3];
            int total = 0;

            for (int j = 0; j < 3; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                total += scores[j];
            }

            boolean pass = true;

            if (total < 55) pass = false;

            if (scores[0] < 35*0.3 || scores[1] < 25*0.3 || scores[2] < 40*0.3) pass = false;

            bw.write(id + " " + total + " " + (pass ? "PASS" : "FAIL") + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
