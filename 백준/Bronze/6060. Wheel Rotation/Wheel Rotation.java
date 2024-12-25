import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> a = new HashMap<>();
        HashMap<Integer, Integer> b = new HashMap<>();

        for (int i = 1; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int d = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            a.put(s, d);
            b.put(s, c);
        }

        int ans = 0;
        int curr = 1;

        for (int i = 1; i < n; i++) {
            if (b.get(curr) == 1)
                ans++;
            curr = a.get(curr);
        }

        System.out.println(ans % 2);
    }
}
