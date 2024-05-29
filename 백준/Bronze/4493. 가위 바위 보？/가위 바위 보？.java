import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int player1Wins = 0;
            int player2Wins = 0;

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char player1 = st.nextToken().charAt(0);
                char player2 = st.nextToken().charAt(0);

                if (player1 == player2) continue;

                if ((player1 == 'R' && player2 == 'S') || (player1 == 'S' && player2 == 'P') || (player1 == 'P' && player2 == 'R')) {
                    player1Wins++;
                } else player2Wins++;
            }

            if (player1Wins > player2Wins) bw.write("Player 1\n");
            else if (player1Wins < player2Wins) bw.write("Player 2\n");
            else bw.write("TIE\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
