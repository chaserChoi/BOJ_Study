import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        long remainder = 0;

        for (int i = 0; i < N.length(); i++) remainder = (remainder * 10 + (N.charAt(i) - '0')) % 20000303;

        bw.write(String.valueOf(remainder));

        bw.flush();
        bw.close();
        br.close();
    }
}
