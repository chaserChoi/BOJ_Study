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

        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean isSuccess = true;

        for (int i = 0; i < 8; i++) {
            int bit = Integer.parseInt(st.nextToken());
            if (bit == 9) {
                isSuccess = false;
                break;
            }
        }

        if (isSuccess) bw.write("S");
        else bw.write("F");

        bw.flush();
        bw.close();
        br.close();
    }
}
