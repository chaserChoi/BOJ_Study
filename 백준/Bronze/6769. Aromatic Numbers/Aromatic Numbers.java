import java.io.*;
import java.util.HashMap;

public class Main {
    private static final HashMap<Character, Integer> roman = new HashMap<>();

    static {
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int ans = 0;
        for (int i = 0; i < str.length(); i += 2) {
            int a = str.charAt(i) - '0';
            char r = str.charAt(i + 1);
            int val = a * roman.get(r);

            if (i + 2 < str.length() && roman.get(r) < roman.get(str.charAt(i + 3)))
                ans -= val;
            else
                ans += val;
        }

        System.out.println(ans);
    }
}

