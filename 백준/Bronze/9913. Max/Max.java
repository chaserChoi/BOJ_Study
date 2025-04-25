import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] freq = new int[1001];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            freq[num]++;
        }

        int max = 0;
        for (int i = 1; i <= 1000; i++) {
            if (freq[i] > max)
                max = freq[i];
        }

        System.out.println(String.valueOf(max));
    }
}