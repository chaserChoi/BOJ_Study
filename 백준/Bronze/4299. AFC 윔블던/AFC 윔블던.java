import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = Integer.parseInt(st.nextToken());
        int diff = Integer.parseInt(st.nextToken());

        int score1 = (sum + diff) / 2;
        int score2 = (sum - diff) / 2;

        if (sum < diff || (sum + diff) % 2 != 0 || (sum - diff) % 2 != 0 || score1 < 0 || score2 < 0) {
            bw.write("-1\n");
        } else {
            if (score1 >= score2) bw.write(score1 + " " + score2 + "\n");
            else bw.write(score2 + " " + score1 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
