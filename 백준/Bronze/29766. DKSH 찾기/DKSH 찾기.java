import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int count = 0;

        for (int i = 0; i <= input.length() - 4; i++) {
            if (input.charAt(i) == 'D' && input.charAt(i + 1) == 'K' && input.charAt(i + 2) == 'S' && input.charAt(i + 3) == 'H') {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }
}
