import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int t = 0, d = 0, l = 0, f = 0;

        for (char c : input.toCharArray()) {
            if (c == 'T') t++;
            else if (c == 'D') d++;
            else if (c == 'L') l++;
            else if (c == 'F') f++;
        }

        long result = (long) Math.pow(2, t + d + l + f);

        System.out.println(result);
    }
}
