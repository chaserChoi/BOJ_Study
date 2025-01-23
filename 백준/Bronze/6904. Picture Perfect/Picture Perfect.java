import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int c = Integer.parseInt(br.readLine());
            if (c == 0) break;

            int minPerimeter = Integer.MAX_VALUE;
            int optimalWidth = 1;
            int optimalHeight = c;

            for (int i = 2; i * i <= c; i++) {
                if (c % i != 0) continue;

                int width = i;
                int height = c / i;

                int perimeter = 2 * (width + height);

                if (perimeter < minPerimeter) {
                    minPerimeter = perimeter;
                    optimalWidth = width;
                    optimalHeight = height;
                }
            }

            if (minPerimeter > 2 * (1 + c))
                minPerimeter = 2 * (1 + c);

            System.out.printf("Minimum perimeter is %d with dimensions %d x %d%n", minPerimeter, optimalWidth, optimalHeight);
        }
    }
}

