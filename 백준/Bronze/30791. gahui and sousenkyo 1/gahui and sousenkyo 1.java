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

        int votesOf16th = Integer.parseInt(st.nextToken());

        int competitionRate = 0;

        for (int i = 0; i < 4; i++) {
            int votes = Integer.parseInt(st.nextToken());
            if (votesOf16th - votes <= 1000) competitionRate++;
        }

        bw.write(String.valueOf(competitionRate));
        bw.newLine();

        br.close();
        bw.close();
    }
}
