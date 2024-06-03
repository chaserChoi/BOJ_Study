import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] aCard = new int[n];
        int[] bCard = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            aCard[i] = Integer.parseInt(st.nextToken());
            bCard[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (aCard[i] > bCard[i]) {
                aCard[i] += bCard[i];
                bCard[i] = 0;
            } else if (aCard[i] < bCard[i]) {
                bCard[i] += aCard[i];
                aCard[i] = 0;
            }
        }

        int scoreA = Arrays.stream(aCard).sum();
        int scoreB = Arrays.stream(bCard).sum();

        bw.write(scoreA + " " + scoreB);
        bw.newLine();

        br.close();
        bw.close();
    }
}
