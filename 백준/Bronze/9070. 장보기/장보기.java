import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] pairs = new int[n][2];

            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                pairs[i][0] = Integer.parseInt(input[0]);
                pairs[i][1] = Integer.parseInt(input[1]);
            }

            Arrays.sort(pairs, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    long left = (long) a[0] * b[1];
                    long right = (long) b[0] * a[1];
                    if (left == right)
                        return Integer.compare(b[1], a[1]);
                    return Long.compare(left, right);
                }
            });
            System.out.println(pairs[n - 1][1]);
        }
    }
}
