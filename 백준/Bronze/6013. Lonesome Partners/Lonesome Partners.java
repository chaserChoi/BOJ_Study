import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] cows = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            cows[i][0] = Integer.parseInt(input[0]);
            cows[i][1] = Integer.parseInt(input[1]);
        }

        double max = 0;
        int cow1 = 0, cow2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double dist = Math.pow(cows[i][0] - cows[j][0], 2) + Math.pow(cows[i][1] - cows[j][1], 2);
                if (dist > max) {
                    max = dist;
                    cow1 = i + 1;
                    cow2 = j + 1;
                }
            }
        }

        if (cow1 > cow2)
            System.out.println(cow2 + " " + cow1);
        else
            System.out.println(cow1 + " " + cow2);
    }
}
