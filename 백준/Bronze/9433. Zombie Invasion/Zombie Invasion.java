import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] villages = new int[20];
            for (int j = 0; j < 20; j++)
                villages[j] = Integer.parseInt(st.nextToken());

            for (int j = 19; j > 0; j--) {
                if (villages[j] >= 2) {
                    villages[j - 1] += villages[j] / 2;
                    villages[j] %= 2;
                }
            }

            for (int j = 0; j < 20; j++)
                System.out.print(villages[j] + " ");

            System.out.println();
        }
    }
}
