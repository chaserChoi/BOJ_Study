import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        String line;
        while ((line = br.readLine()) != null) {
            for (int i = 3; i < line.length(); i++) {
                if (line.charAt(i - 3) == 'j' && line.charAt(i - 2) == 'o' &&
                line.charAt(i - 1) == 'k' && line.charAt(i) == 'e')
                    result++;
            }
        }

        System.out.println(result);
    }
}
