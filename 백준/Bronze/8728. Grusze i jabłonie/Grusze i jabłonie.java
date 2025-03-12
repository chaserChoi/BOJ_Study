import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(st.nextToken());

        int firstZeroIdx = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                firstZeroIdx = i;
                break;
            }
        }

        int lastZeroIdx = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == 0) {
                lastZeroIdx = i;
                break;
            }
        }

        int firstOneIdx = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                firstOneIdx = i;
                break;
            }
        }

        int lastOneIdx = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == 1) {
                lastOneIdx = i;
                break;
            }
        }

        int max = Math.max(
                lastOneIdx - firstZeroIdx,
                lastZeroIdx - firstOneIdx
        );

        System.out.println(max);
    }
}
