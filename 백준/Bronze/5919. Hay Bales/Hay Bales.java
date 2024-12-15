import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] piles = new int[n];

        int total = 0;
        for (int i = 0; i < n; i++) {
            piles[i] = Integer.parseInt(br.readLine());
            total += piles[i];
        }

        int target = total / n;

        int moves = 0;
        for (int i = 0; i < n; i++) {
            if (piles[i] > target)
                moves += piles[i] - target;
        }

        bw.write(moves + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
