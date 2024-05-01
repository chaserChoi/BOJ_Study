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

        for(int i = 0; i < input.length(); i+=2) {
            char player = input.charAt(i);
            int points = Character.getNumericValue(input.charAt(i + 1));

            if(player == 'A') scoreA += points;
            else scoreB += points;

            if((scoreA >= 11 || scoreB >= 11) && Math.abs(scoreA - scoreB) >= 2) {
                bw.write((scoreA > scoreB ? "A" : "B") + "\n");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
