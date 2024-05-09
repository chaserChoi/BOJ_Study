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
        int lv = Integer.parseInt(st.nextToken());
        String judgement = st.nextToken();

        int score = 0;

        switch (judgement) {
            case "miss":
                score = 0;
                break;
            case "bad":
                score = 200 * lv;
                break;
            case "cool":
                score = 400 * lv;
                break;
            case "great":
                score = 600 * lv;
                break;
            case "perfect":
                score = 1000 * lv;
                break;
            default:
                break;
        }

        bw.write(Integer.toString(score));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
