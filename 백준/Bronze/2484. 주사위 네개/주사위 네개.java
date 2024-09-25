import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int[] dice = new int[4];
            for (int j = 0; j < 4; j++)
                dice[j] = Integer.parseInt(input[j]);

            max = Math.max(max, calcPrize(dice));
        }

        pw.println(max);

        pw.flush();
        pw.close();
        br.close();
    }

    private static int calcPrize(int[] dice) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int die : dice)
            map.put(die, map.getOrDefault(die, 0) + 1);

        int prize = 0;
        int[] cnts = new int[7];
        for (int die : map.keySet())
            cnts[map.get(die)]++;

        if (cnts[4] == 1) {
            for (int die : map.keySet()) {
                if (map.get(die) == 4) {
                    prize = 50000 + die * 5000;
                    break;
                }
            }
        } else if (cnts[3] == 1) {
            for (int die : map.keySet()) {
                if (map.get(die) == 3) {
                    prize = 10000 + die * 1000;
                    break;
                }
            }
        } else if (cnts[2] == 2) {
            prize = 2000;
            for (int die : map.keySet()) {
                if (map.get(die) == 2)
                    prize += die * 500;
            }
        } else if (cnts[2] == 1) {
            for (int die : map.keySet()) {
                if (map.get(die) == 2) {
                    prize = 1000 + die * 100;
                    break;
                }
            }
        } else {
            int maxDie = 0;
            for (int die : dice) {
                if (die > maxDie)
                    maxDie = die;
            }
            prize = maxDie * 100;
        }

        return prize;
    }
}
