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

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            int evenSum = 0, oddSum = 0;

            for (int i = 0; i < k; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 0) evenSum += num;
                else oddSum += num;
            }

            if (evenSum > oddSum) bw.write("EVEN\n");
            else if (oddSum > evenSum) bw.write("ODD\n");
            else bw.write("TIE\n");
        }

        bw.flush();
        bw.close();
        br.close(); 
    }
}
