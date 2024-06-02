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

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int checkBit = Integer.parseInt(st.nextToken());

            int onesCnt = Integer.bitCount(num);

            boolean isValid = (onesCnt % 2 == 0 && checkBit == 0) || (onesCnt % 2 == 1 && checkBit == 1);

            if (isValid) bw.write("Valid\n");
            else bw.write("Corrupt\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
