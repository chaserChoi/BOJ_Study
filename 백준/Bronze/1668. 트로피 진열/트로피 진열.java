import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int[] heights = new int[n];

        for (int i = 0; i < n; i++)
            heights[i] = Integer.parseInt(br.readLine());

        int l = countVisible(heights, n);
        int r = countVisible(reverseArr(heights), n);

        pw.println(l);
        pw.println(r);

        pw.flush();
        pw.close();
        br.close();
    }

    private static int countVisible(int[] heights, int n) {
        int cnt = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (heights[i] > max) {
                max = heights[i];
                cnt++;
            }
        }

        return cnt;
    }

    private static int[] reverseArr(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++)
            reversed[i] = arr[n - i - 1];

        return reversed;
    }
}
