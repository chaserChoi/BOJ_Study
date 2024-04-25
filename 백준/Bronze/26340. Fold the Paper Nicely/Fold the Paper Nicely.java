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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int folds = Integer.parseInt(st.nextToken());

            bw.write(String.format("Data set: %d %d %d\n", a, b, folds));

            for (int j = 0; j < folds; j++) {
                if (a < b) b = b / 2;
                else a = a / 2;
            }

            if (a > b) bw.write(a + " " + b + "\n\n");
            else bw.write(b + " " + a + "\n\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
