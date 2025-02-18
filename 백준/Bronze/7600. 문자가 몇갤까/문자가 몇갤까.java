import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("#")) {
            boolean[] alphabet = new boolean[26];
            int unique = 0;

            for (char c : line.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    int idx = Character.toLowerCase(c) - 'a';
                    if (!alphabet[idx]) {
                        alphabet[idx] = true;
                        unique++;
                    }
                }
            }

            System.out.println(unique);
        }
    }
}
