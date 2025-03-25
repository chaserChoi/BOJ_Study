import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int[] scores = new int[5];

            for (int i = 0; i < 5; i++)
                scores[i] = Integer.parseInt(input[i]);

            Arrays.sort(scores);

            int sum = scores[1] + scores[2] + scores[3];
            int max = scores[3];
            int min = scores[1];

            if (max - min >= 4)
                sb.append("KIN\n");
            else
                sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
