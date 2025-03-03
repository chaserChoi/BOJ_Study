import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++)
            scores[i] = Integer.parseInt(input[i]);

        int max = Arrays.stream(scores).max().getAsInt();

        for (int i = 0; i < n; i++) {
            if (scores[i] == max)
                System.out.print((char) ('A' + i));
        }
    }
}
