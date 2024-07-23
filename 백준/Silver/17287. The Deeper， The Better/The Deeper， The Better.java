import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int max = -1;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[')
                sum += 3;
            else if (c == '{')
                sum += 2;
            else if (c == '(')
                sum += 1;
            else if (c == ')')
                sum -= 1;
            else if (c == '}')
                sum -= 2;
            else if (c == ']')
                sum -= 3;
            else if (c >= '0' && c <= '9') {
                if (sum > max)
                    max = sum;
            }
        }

        System.out.println(max);
    }
}
