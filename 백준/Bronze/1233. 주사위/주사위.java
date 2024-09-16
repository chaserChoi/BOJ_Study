import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int s1 = Integer.parseInt(line[0]);
        int s2 = Integer.parseInt(line[1]);
        int s3 = Integer.parseInt(line[2]);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    int sum = i + j + k;
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        int max = 0;
        int ans = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currSum = entry.getKey();
            int currCnt = entry.getValue();

            if (currCnt > max || (currCnt == max && currSum < ans)) {
                max = currCnt;
                ans = currSum;
            }
        }

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}
