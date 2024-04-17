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
        String S = br.readLine();
        String T = br.readLine();
        int hammingDistance = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) != T.charAt(i)) hammingDistance++;
        }

        bw.write(String.valueOf(hammingDistance));

        bw.flush();
        bw.close();
        br.close();
    }
}
