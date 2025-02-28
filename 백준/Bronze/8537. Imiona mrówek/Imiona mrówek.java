import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            HashSet<Character> set = new HashSet<>();

            for (char c : name.toCharArray())
                set.add(c);

            max = Math.max(max, set.size());
        }

        System.out.println(max);
    }
}
