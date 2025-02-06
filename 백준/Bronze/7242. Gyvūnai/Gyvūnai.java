import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] intervals = new int[n][4];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            intervals[i][0] = Integer.parseInt(input[0]) * 60 + Integer.parseInt(input[1]);
            intervals[i][1] = Integer.parseInt(input[2]) * 60 + Integer.parseInt(input[3]);
        }

        int max = intervals[0][0];
        int min = intervals[0][1];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, intervals[i][0]);
            min = Math.min(min, intervals[i][1]);
        }

        if (max < min) {
            System.out.println("TAIP");
            int startH = max / 60;
            int startM = max % 60;
            int endH = min / 60;
            int endM = min % 60;
            System.out.printf("%d %d %d %d\n", startH, startM, endH, endM);
        } else
            System.out.println("NE");
    }
}
