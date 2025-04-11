import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st1.nextToken());
            int[] mountains1 = new int[n1];
            for (int j = 0; j < n1; j++)
                mountains1[j] = Integer.parseInt(st1.nextToken());
            Arrays.sort(mountains1);

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int n2 = Integer.parseInt(st2.nextToken());
            int[] mountains2 = new int[n2];
            for (int j = 0; j < n2; j++)
                mountains2[j] = Integer.parseInt(st2.nextToken());
            Arrays.sort(mountains2);

            int minDiff = Integer.MAX_VALUE;
            int x = 0, y = 0;
            while (x < n1 && y < n2) {
                int diff = Math.abs(mountains1[x] - mountains2[y]);
                minDiff = Math.min(minDiff, diff);

                if (mountains1[x] < mountains2[y])
                    x++;
                else
                    y++;
            }

            System.out.println(minDiff);
        }
    }
}
