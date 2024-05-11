import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = 0;

        for(int i = 0; i < 8; i++) {
            String line = br.readLine();
            for(int j = 0; j < 8; j++) {
                char piece = line.charAt(j);
                switch(piece) {
                    case 'P': score += 1; break;
                    case 'N': case 'B': score += 3; break;
                    case 'R': score += 5; break;
                    case 'Q': score += 9; break;
                    case 'p': score -= 1; break;
                    case 'n': case 'b': score -= 3; break;
                    case 'r': score -= 5; break;
                    case 'q': score -= 9; break;
                }
            }
        }

        bw.write(String.valueOf(score));
        br.close();
        bw.flush();
        bw.close();
    }
}
