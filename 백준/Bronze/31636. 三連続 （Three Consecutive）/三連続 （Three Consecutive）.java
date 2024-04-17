import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        String answer = "No";
        for (int i = 0; i < N - 2; i++) {
            if (S.charAt(i) == 'o' && S.charAt(i + 1) == 'o' && S.charAt(i + 2) == 'o') {
                answer = "Yes";
                break;
            }
        }

        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();
    }
}
