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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int visitingScore = calculateScore(st);

        st = new StringTokenizer(br.readLine());
        int homeScore = calculateScore(st);
        
        bw.write(visitingScore + " " + homeScore);
        
        bw.flush();
        bw.close();
        br.close();
    }

    private static int calculateScore(StringTokenizer st) {
        int T = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 점수 계산
        return T * 6 + F * 3 + S * 2 + P * 1 + C * 2;
    }
}
