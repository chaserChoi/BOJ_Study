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
        int vowelsWithoutY = 0;
        int vowelsWithY = 0;
        String vowels = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                vowelsWithoutY++;
                vowelsWithY++;
            }
            else if (c == 'y') vowelsWithY++;
        }

        bw.write(vowelsWithoutY + " " + vowelsWithY + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
