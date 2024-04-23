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
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            alphabet[c - 'A'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                char missingLetter = (char) ('A' + i);
                bw.write(missingLetter);
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
