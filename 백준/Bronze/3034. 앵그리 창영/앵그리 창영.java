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
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        double diagonal = Math.sqrt(W * W + H * H);

        for (int i = 0; i < N; i++) {
            int matchLength = Integer.parseInt(br.readLine());
            if (matchLength <= diagonal) bw.write("DA\n");
            else bw.write("NE\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
