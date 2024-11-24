import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String line = br.readLine().trim();
            String[] tokens = line.split(" ");

            double ans = Double.parseDouble(tokens[0]);

            for (int j = 1; j < tokens.length; j++) {
                char operator = tokens[j].charAt(0);
                switch (operator) {
                    case '@':
                        ans *= 3;
                        break;
                    case '%':
                        ans += 5;
                        break;
                    case '#':
                        ans -= 7;
                        break;
                }
            }

            System.out.printf("%.2f\n" ,ans);
        }
    }
}

