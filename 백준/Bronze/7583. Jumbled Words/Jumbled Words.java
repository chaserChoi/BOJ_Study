import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("#")) {
            String[] words = line.split(" ");
            StringBuilder sb = new StringBuilder();

            for (String word : words) {
                if (word.length() > 2) {
                    char first = word.charAt(0);
                    char last = word.charAt(word.length() - 1);
                    String middle = word.substring(1, word.length() - 1);

                    String reversed = new StringBuilder(middle).reverse().toString();

                    sb.append(first).append(reversed).append(last);
                } else
                    sb.append(word);
                sb.append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
