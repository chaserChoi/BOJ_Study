import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int maxTeams = 0;

        while (N >= 2 && M >= 1 && N + M >= K + 3) {
            N -= 2;
            M -= 1;
            maxTeams++;
        }

        bw.write(String.valueOf(maxTeams));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
