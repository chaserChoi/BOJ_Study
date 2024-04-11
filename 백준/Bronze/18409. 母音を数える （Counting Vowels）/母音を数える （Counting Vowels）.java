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

        int vowelCount = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') vowelCount++;
        }

        bw.write(String.valueOf(vowelCount));

        bw.flush();
        br.close();
        bw.close();
    }
}
