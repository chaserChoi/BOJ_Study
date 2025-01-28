import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] x = new int[n];
            int[] y = new int[n];

            String[] xinput = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                x[j] = Integer.parseInt(xinput[j]);

            String[] yinput = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                y[j] = Integer.parseInt(yinput[j]);
            }

            int max = calcMaxDistance(x, y, n);
            System.out.println("The maximum distance is " + max + "\n");
        }
    }

    private static int calcMaxDistance(int[] x, int[] y, int n) {
        int max = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && y[j] >= x[i])
                j++;
            if (j > i)
                max = Math.max(max, j - 1 - i);
        }

        return max;
    }
}

