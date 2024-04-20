import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            int digitA = a.charAt(i) - '0';
            int digitB = b.charAt(i) - '0';

            result.append(Math.max(digitA, digitB));
        }

        bw.write(result.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
