import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String scanner = br.readLine();
        int n = Integer.parseInt(br.readLine());

        List<String> matching = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String register = br.readLine();
            if (match(scanner, register))
                matching.add(register);
        }

        System.out.println(matching.size());
        for (String code : matching)
            System.out.println(code);
    }

    private static boolean match(String scanner, String register) {
        if (scanner.length() != register.length())
            return false;

        for (int i = 0; i < scanner.length(); i++) {
            char s = scanner.charAt(i);
            char r = register.charAt(i);

            if (s != '*' && s != r)
                return false;
        }

        return true;
    }
}
