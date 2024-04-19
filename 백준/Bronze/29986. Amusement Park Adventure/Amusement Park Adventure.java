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
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            if (H >= Integer.parseInt(st.nextToken())) count++;
        }

        bw.write(String.valueOf(count));
        bw.newLine();

        br.close();
        bw.close();
    }
}
