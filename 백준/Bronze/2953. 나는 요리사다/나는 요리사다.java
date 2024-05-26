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

        int maxScore = 0;
        int winner = 0;

        for (int i = 1; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            while (st.hasMoreTokens()) sum += Integer.parseInt(st.nextToken());
            if (sum > maxScore) {
                maxScore = sum;
                winner = i;
            }
        }

        bw.write(winner + " " + maxScore + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
