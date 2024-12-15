import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            if (n == 0 && m == 0) break;

            HashMap<Integer, Integer> map = new HashMap<>();
            String[] tickets = br.readLine().split(" ");
            for (String t : tickets) {
                int x = Integer.parseInt(t);
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            int ans = 0;
            for (int cnt : map.values()) {
                if (cnt > 1) ans++;
            }

            System.out.println(ans);
        }
    }
}
