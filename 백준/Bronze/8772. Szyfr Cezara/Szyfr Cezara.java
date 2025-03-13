import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int z = Integer.parseInt(br.readLine());

        while (z-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            char c = br.readLine().charAt(0);

            while (s.charAt(0) != c) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    char newChar = (char) ((s.charAt(i) - 'a' + 1) % 26 + 'a');
                    sb.append(newChar);
                }
                s = sb.toString();
            }
            System.out.println(s);
        }
    }
}
