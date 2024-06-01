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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] scores = new int[6];
            int sum = 0;

            for (int i = 0; i < 6; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
                sum += scores[i];
            }

            if (sum == 0) break;

            int max = scores[0], min = scores[0];
            for (int i = 1; i < 6; i++) {
                if (scores[i] > max) max = scores[i];
                if (scores[i] < min) min = scores[i];
            }

            int score = sum - max - min;
            double average = score / 4.0;

            if (average % 1 == 0) bw.write(String.valueOf((int)average));
            else bw.write(String.valueOf(average));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
