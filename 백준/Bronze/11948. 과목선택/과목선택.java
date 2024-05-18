import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] scienceScores = new int[4];
        for (int i = 0; i < 4; i++) scienceScores[i] = Integer.parseInt(br.readLine());

        int historyScore = Integer.parseInt(br.readLine());
        int geographyScore = Integer.parseInt(br.readLine());

        Arrays.sort(scienceScores);
        int totalScore = scienceScores[1] + scienceScores[2] + scienceScores[3];

        totalScore += Math.max(historyScore, geographyScore);

        bw.write(String.valueOf(totalScore));

        bw.flush();
        br.close();
        bw.close();
    }
}
