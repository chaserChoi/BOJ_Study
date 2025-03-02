import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (char c : line.toCharArray())
                map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (map.containsKey(c))
                System.out.println(c + " " + map.get(c));
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            if (map.containsKey(c))
                System.out.println(c + " " + map.get(c));
        }
    }
}
