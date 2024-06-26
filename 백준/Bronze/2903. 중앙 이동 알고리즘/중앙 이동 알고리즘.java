import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int L = (int) Math.pow(2, N) + 1;
        int totalPoints = L * L;

        bw.write(String.valueOf(totalPoints));

        bw.flush();
        bw.close();
        br.close();
    }
}
