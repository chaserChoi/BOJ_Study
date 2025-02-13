import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int h = 10;
        String plate = br.readLine();

        for (int i = 1; i < plate.length(); i++) {
            if (plate.charAt(i) == '(' && plate.charAt(i - 1) == ')')
                h += 10;
            else if (plate.charAt(i) == ')' && plate.charAt(i - 1) == '(')
                h += 10;
            else if (plate.charAt(i) == '(' && plate.charAt(i - 1) == '(')
                h += 5;
            else if (plate.charAt(i) == ')' && plate.charAt(i - 1) == ')')
                h += 5;
        }

        System.out.println(h);
    }
}
