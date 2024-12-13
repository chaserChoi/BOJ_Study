import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int c = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);

            if (n == 0 && c == 0 && k == 0) break;

            int[] freq = new int[k + 1];

            for (int i = 0; i < n; i++) {
                String[] nums = br.readLine().split(" ");
                for (int j = 0; j < c; j++) {
                    int num = Integer.parseInt(nums[j]);
                    freq[num]++;
                }
            }

            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= k; i++) {
                if (freq[i] < min) min = freq[i];
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= k; i++) {
                if (freq[i] == min) sb.append(i).append(" ");
            }

            bw.write(sb.toString().trim() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
