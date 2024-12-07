import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;
        int right = 0;
        int acute = 0;
        int obtuse = 0;

        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);

            int[] sides = {a, b, c};
            java.util.Arrays.sort(sides);

            if (sides[0] + sides[1] <= sides[2]) {
                System.out.println(total + " " + right + " " + acute + " " + obtuse);
                return;
            }

            total++;
            int a2 = sides[0] * sides[0];
            int b2 = sides[1] * sides[1];
            int c2 = sides[2] * sides[2];

            if (a2 + b2 == c2)
                right++;
            else if (a2 + b2 > c2)
                acute++;
            else
                obtuse++;
        }
    }
}
