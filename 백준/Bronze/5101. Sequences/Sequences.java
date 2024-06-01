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

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int diff = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            if (start == 0 && diff == 0 && value == 0) break;

            if ((value - start) % diff == 0 && (value - start) / diff >= 0) {
                int term = (value - start) / diff + 1;
                bw.write(term + "\n");
            } else bw.write("X\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
