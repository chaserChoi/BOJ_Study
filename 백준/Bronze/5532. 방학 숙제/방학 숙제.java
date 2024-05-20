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

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int daysForKorean = (int) Math.ceil((double) A / C);
        int daysForMath = (int) Math.ceil((double) B / D);

        int maxDaysForHomework = Math.max(daysForKorean, daysForMath);

        int daysToPlay = L - maxDaysForHomework;

        bw.write(daysToPlay + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
