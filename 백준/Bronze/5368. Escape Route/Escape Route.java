import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            char[][] grid = new char[m][m];
            int shipX = -1, shipY = -1;

            for (int j = 0; j < m; j++) {
                String line = br.readLine();
                for (int k = 0; k < m; k++) {
                    grid[j][k] = line.charAt(k);
                    if (grid[j][k] == 's') {
                        shipX = j;
                        shipY = k;
                    }
                }
            }

            double min = Double.MAX_VALUE;
            int closestX = -1, closestY = -1;

            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    if (grid[j][k] == 'p') {
                        double dist = Math.sqrt(Math.pow(shipX - j, 2) + Math.pow(shipY - k, 2));
                        if (dist < min) {
                            min = dist;
                            closestX = j;
                            closestY = k;
                        }
                    }
                }
            }

            System.out.printf("(%d,%d):(%d,%d):%.2f\n", shipX, shipY, closestX, closestY, min);
        }
    }
}
