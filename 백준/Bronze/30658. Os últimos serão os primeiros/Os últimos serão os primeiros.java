import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int[] teams = new int[n];
            for (int i = 0; i < n; i++) teams[i] = Integer.parseInt(br.readLine());

            for (int i = n - 1; i >= 0; i--) {
                bw.write(Integer.toString(teams[i]));
                bw.newLine();
            }
            bw.write("0\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
