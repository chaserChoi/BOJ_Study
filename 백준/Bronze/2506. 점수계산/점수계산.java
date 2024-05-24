import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalScore = 0;
        int currentStreak = 0;

        for (int i = 0; i < N; i++) {
            int result = Integer.parseInt(st.nextToken());

            if (result == 1) {
                currentStreak++;
                totalScore += currentStreak;
            } else currentStreak = 0;
        }

        bw.write(String.valueOf(totalScore));

        bw.flush();
        bw.close();
        br.close();
    }
}
