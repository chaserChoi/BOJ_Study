import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        for (int i = 0; i < n; i++)
            input = performOperation(input);

        System.out.println(input);
    }

    private static String performOperation(String input) {
        StringBuilder sb = new StringBuilder();
        int len = input.length();
        int cnt = 1;

        for (int i = 1; i < len; i++) {
            if (input.charAt(i) == input.charAt(i - 1))
                cnt++;
            else {
                sb.append(cnt).append(input.charAt(i - 1));
                cnt = 1;
            }
        }

        sb.append(cnt).append(input.charAt(len - 1));

        return sb.toString();
    }
}
