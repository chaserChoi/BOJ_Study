import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());

        int minimumMelodies = (A * (I - 1)) + 1;

        bw.write(String.valueOf(minimumMelodies));

        bw.flush();
        bw.close();
        br.close();
    }
}
