import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        if (n.equals("0")) {
            System.out.print('1');
            return;
        }

        System.out.print("6248".charAt(calc(n) % 4));
    }

    private static int calc(String str) {
        if (str.length() == 1)
            return Integer.parseInt(str);
        return Integer.parseInt(str.substring(str.length() - 2));
    }
}
