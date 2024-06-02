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

        int T = Integer.parseInt(br.readLine());

        for (int b = 0; b < T; b++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pieces = Integer.parseInt(st.nextToken());
            int[] rows = new int[9];

            for (int p = 0; p < pieces; p++) {
                int col = Integer.parseInt(st.nextToken());
                int row = Integer.parseInt(st.nextToken());
                rows[row]++;
            }

            int maxPieces = 0;
            for (int i = 1; i <= 8; i++) {
                if (rows[i] > maxPieces) maxPieces = rows[i];
            }

            bw.write(maxPieces + "\n");
        }

        bw.flush();
        bw.close();
        br.close(); 
    }
}
