import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int questions = Integer.parseInt(br.readLine());
            String answerKey = br.readLine();
            String answers = br.readLine();

            int incorrectCnt = 0;
            for (int j = 0; j < questions; j++) {
                if (answerKey.charAt(j) != answers.charAt(j))
                    incorrectCnt++;
            }

            System.out.println("Case " + i + ": " + incorrectCnt);
        }
    }
}
