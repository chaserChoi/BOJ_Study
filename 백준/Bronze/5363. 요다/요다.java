import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String sentence = br.readLine();
            String[] words = sentence.split(" ");

            String first = words[0];
            String second = words[1];

            StringBuilder sb = new StringBuilder();
            for (int j = 2; j < words.length; j++) {
                sb.append(words[j]);
                sb.append(" ");
            }

            System.out.println(sb.toString().trim() + " " + first + " " + second);
        }
    }
}

