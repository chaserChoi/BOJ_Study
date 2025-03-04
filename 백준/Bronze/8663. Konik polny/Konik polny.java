import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);

        int jumps = 0;
        int dist = 0;

        while (dist < x) {
            jumps++;
            dist += s;

            s = s / 2;
            if (s == 0)
                s = 1;
        }

        System.out.println(jumps);
    }
}
