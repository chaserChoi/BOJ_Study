import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int setNum = 1;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String[] heights = br.readLine().split(" ");
            int[] hs = new int[n];
            int total = 0;

            for (int i = 0; i < n; i++) {
                hs[i] = Integer.parseInt(heights[i]);
                total += hs[i];
            }

            int target = total / n;
            int moves = 0;

            for (int h : hs) {
                if (h > target)
                    moves += (h - target);
            }

            System.out.printf("Set #%d\n", setNum);
            System.out.printf("The minimum number of moves is %d.\n\n", moves);
            setNum++;
        }
    }
}
