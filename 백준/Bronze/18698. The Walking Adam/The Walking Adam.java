import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < T; testCase++) {
            String steps = br.readLine();
            int stepsBeforeFalling = 0;

            for (char step : steps.toCharArray()) {
                if (step == 'U') stepsBeforeFalling++;
                else break;
            }

            bw.write(String.valueOf(stepsBeforeFalling));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
