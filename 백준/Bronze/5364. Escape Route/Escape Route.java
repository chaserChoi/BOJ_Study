import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] first = br.readLine().split(" ");
        int x1 = Integer.parseInt(first[0]);
        int y1 = Integer.parseInt(first[1]);

        int closestX = 0;
        int closestY = 0;
        double min = Double.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int x2 = Integer.parseInt(line[0]);
            int y2 = Integer.parseInt(line[1]);

            double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if (dist < min) {
                min = dist;
                closestX = x2;
                closestY = y2;
            }
        }

        System.out.printf("%d %d\n", x1, y1);
        System.out.printf("%d %d\n", closestX, closestY);
        System.out.printf("%.2f\n", min);
    }
}

