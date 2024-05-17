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

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int team1 = A + D;
        int team2 = B + C;
        int diff1 = Math.abs(team1 - team2);

        team1 = A + C;
        team2 = B + D;
        int diff2 = Math.abs(team1 - team2);

        team1 = A + B;
        team2 = C + D;
        int diff3 = Math.abs(team1 - team2);

        int minDiff = Math.min(diff1, Math.min(diff2, diff3));

        bw.write(String.valueOf(minDiff));

        bw.flush();
        bw.close();
        br.close();
    }
}
