import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int scoreD = 0;
        int scoreP = 0;

        for (int i = 0; i < N; i++) {
            String winner = br.readLine();
            if ("D".equals(winner)) scoreD++;
            else if ("P".equals(winner)) scoreP++;

            if (Math.abs(scoreD - scoreP) >= 2 || i == N-1) break;
        }

        bw.write(scoreD + ":" + scoreP);

        bw.flush();
        br.close();
        bw.close();
    }
}
