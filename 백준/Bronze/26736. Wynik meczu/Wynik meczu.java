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
        int scoreA = 0, scoreB = 0;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'A') scoreA++;
            else if(input.charAt(i) == 'B') scoreB++;
        }

        bw.write(scoreA + " : " + scoreB);
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }
}
