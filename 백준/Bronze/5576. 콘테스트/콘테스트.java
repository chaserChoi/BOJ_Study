import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] wScores = new int[10];
        int[] kScores = new int[10];

        for (int i = 0; i < 10; i++)
            wScores[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < 10; i++)
            kScores[i] = Integer.parseInt(br.readLine());

        Arrays.sort(wScores);
        int wTotal = wScores[7] + wScores[8] + wScores[9];

        Arrays.sort(kScores);
        int kTotal = kScores[7] + kScores[8] + kScores[9];

        System.out.println(wTotal + " " + kTotal);
    }
}
