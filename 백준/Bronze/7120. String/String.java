import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringBuilder sb = new StringBuilder();

        char lastChar = '\0';
        for (char c : input.toCharArray()) {
            if (c != lastChar) {
                sb.append(c);
                lastChar = c;
            }
        }

        System.out.println(sb.toString());
    }
}
