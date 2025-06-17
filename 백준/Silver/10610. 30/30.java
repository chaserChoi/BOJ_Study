import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String num = br.readLine();
        char[] ch = num.toCharArray();

        int sum = 0;
        boolean hasZero = false;

        for (char c : ch) {
            int n = c - '0';
            sum += n;
            if (n == 0)
                hasZero = true;
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.println(sb.append(-1));
            return;
        }

        Arrays.sort(ch);
        sb = new StringBuilder(new String(ch));
        System.out.println(sb.reverse().toString());
    }
}
