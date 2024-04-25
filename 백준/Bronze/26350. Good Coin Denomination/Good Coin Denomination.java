import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int[] denominations = new int[d];
            boolean isGood = true;

            for (int j = 0; j < d; j++) denominations[j] = Integer.parseInt(st.nextToken());

            bw.write("Denominations:");
            for (int denomination : denominations) bw.write(" " + denomination);
            bw.newLine();

            for (int j = 1; j < d; j++) {
                if (denominations[j] < 2 * denominations[j - 1]) {
                    isGood = false;
                    break;
                }
            }

            if (isGood) bw.write("Good coin denominations!\n\n");
            else bw.write("Bad coin denominations!\n\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
