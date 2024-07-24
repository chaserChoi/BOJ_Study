import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int credit = Integer.parseInt(br.readLine());
            int cnt = Integer.parseInt(br.readLine());
            String[] pricesStr = br.readLine().split(" ");
            int[] prices = new int[cnt];

            for (int j = 0; j < cnt; j++)
                prices[j] = Integer.parseInt(pricesStr[j]);

            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < cnt; j++) {
                int price = prices[j];
                int complement = credit - price;

                if (map.containsKey(complement)) {
                    int idx1 = map.get(complement) + 1;
                    int idx2 = j + 1;
                    bw.write("Case #" + i + ": " + Math.min(idx1, idx2) + " " + Math.max(idx1, idx2) + "\n");
                    break;
                }

                map.put(price, j);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
