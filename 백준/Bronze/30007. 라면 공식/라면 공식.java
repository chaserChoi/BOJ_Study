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

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int Ai = Integer.parseInt(st.nextToken());
            int Bi = Integer.parseInt(st.nextToken());
            int Xi = Integer.parseInt(st.nextToken());
            int Wi = Ai * (Xi - 1) + Bi;

            bw.write(String.valueOf(Wi));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
