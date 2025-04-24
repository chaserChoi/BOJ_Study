import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        Map<String, int[]> map = new HashMap<>();
        for (int i = 0; i < g; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int a0 = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            map.put(name, new int[]{a0, d});
        }

        boolean[] lamps = new boolean[l + 1];

        for (int i = 0; i < r; i++) {
            String patrol = br.readLine();
            int[] assign = map.get(patrol);
            int a0 = assign[0];
            int d = assign[1];

            for (int j = a0; j <= l; j += d)
                lamps[j] = !lamps[j];
        }

        int cnt = 0;
        for (int i = 1; i <= l; i++) {
            if (lamps[i])
                cnt++;
        }

        System.out.println(String.valueOf(cnt));
    }
}