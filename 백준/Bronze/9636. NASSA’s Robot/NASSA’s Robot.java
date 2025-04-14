import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String moves = br.readLine();
            int minX = 0, minY = 0, maxX = 0, maxY = 0;
            int x = 0, y = 0;

            int unknown = 0;
            for (char c : moves.toCharArray()) {
                switch (c) {
                    case 'U':
                        y++;
                        break;
                    case 'D':
                        y--;
                        break;
                    case 'R':
                        x++;
                        break;
                    case 'L':
                        x--;
                        break;
                    case '?':
                        unknown++;
                        break;
                }
            }

            minX = x - unknown;
            maxX = x + unknown;
            minY = y - unknown;
            maxY = y + unknown;

            System.out.println(minX + " " + minY + " " + maxX + " " + maxY);
        }
    }
}
