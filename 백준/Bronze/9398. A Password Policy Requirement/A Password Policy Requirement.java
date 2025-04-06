import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < str.length(); j++) {
                for (int k = j + 5; k < str.length(); k++) {
                    String sub = str.substring(j, k + 1);
                    if (isSecure(sub))
                        min = Math.min(min, sub.length());
                }
            }

            if (min == Integer.MAX_VALUE)
                System.out.println(0);
            else
                System.out.println(min);
        }
    }

    private static boolean isSecure(String str) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c))
                hasUpper = true;
            else if (Character.isLowerCase(c))
                hasLower = true;
            else if (Character.isDigit(c))
                hasDigit = true;
        }

        return hasUpper && hasLower && hasDigit;
    }
}
