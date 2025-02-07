import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int m = Integer.parseInt(input[2]);

        List<List<Integer>> groups = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String[] groupInfo = br.readLine().split(" ");
            int gi = Integer.parseInt(groupInfo[0]);
            List<Integer> colors = new ArrayList<>();
            for (int j = 1; j <= gi; j++)
                colors.add(Integer.parseInt(groupInfo[j]));
            groups.add(colors);
        }

        String[] dressCnt = br.readLine().split(" ");
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++)
            d[i] = Integer.parseInt(dressCnt[i - 1]);

        int totalWashes = 0;
        for (List<Integer> group : groups) {
            int totalCnt = 0;
            for (int color : group)
                totalCnt += d[color];
            totalWashes += (totalCnt + m - 1) / m;
        }

        System.out.println(totalWashes);
    }
}
