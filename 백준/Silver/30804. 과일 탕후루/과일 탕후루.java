import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] fruits = br.readLine().split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < n; right++) {
            int type = Integer.parseInt(fruits[right]);
            map.put(type, map.getOrDefault(type, 0) + 1);

            while (map.size() > 2) {
                int leftType = Integer.parseInt(fruits[left]);
                map.put(leftType, map.get(leftType) - 1);
                if (map.get(leftType) == 0)
                    map.remove(leftType);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        System.out.println(max);
    }
}
