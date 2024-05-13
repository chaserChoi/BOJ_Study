import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String emoji = br.readLine();
        int totalLength = emoji.length();
        int colonCount = 2;

        int underscoreCount = 0;
        for (int i = 0; i < emoji.length(); i++) {
            if (emoji.charAt(i) == '_') underscoreCount++;
        }

        int difficulty = totalLength + colonCount + (underscoreCount * 5);
        bw.write(String.valueOf(difficulty));

        bw.flush();
        bw.close();
        br.close();
    }
}
