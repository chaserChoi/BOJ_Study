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

        int N = Integer.parseInt(br.readLine());
        int totalAmount = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int width = Integer.parseInt(st.nextToken());

            switch (width) {
                case 136:
                    totalAmount += 1000;
                    break;
                case 142:
                    totalAmount += 5000;
                    break;
                case 148:
                    totalAmount += 10000;
                    break;
                case 154:
                    totalAmount += 50000;
                    break;
            }
        }

        bw.write(String.valueOf(totalAmount));

        bw.flush();
        br.close();
        bw.close();
    }
}
