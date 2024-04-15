import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int case1 = N - (int)(N * 0.22);

        int case2 = (int)(N * 0.8) + (int)(N * 0.2 * 0.78);

        bw.write(case1 + " " + case2);

        bw.flush();
        br.close();
        bw.close();
    }
}
