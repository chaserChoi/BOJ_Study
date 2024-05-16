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
        int answer = 0;

        if (input.length() == 2) answer = (input.charAt(0) - '0') + (input.charAt(1) - '0');
        else if (input.length() == 3) {
            if (input.charAt(1) == '0') answer = 10 + (input.charAt(2) - '0');
            else answer = (input.charAt(0) - '0') + 10;
        } else answer = 20;

        bw.write(String.valueOf(answer));

        bw.flush();
        br.close();
        bw.close();
    }
}
