import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(input[i]);

        int result = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt = (arr[i] == 1) ? cnt + 1 : 0;
            result = Math.max(result, cnt);
        }

        System.out.println(result);
    }
}
