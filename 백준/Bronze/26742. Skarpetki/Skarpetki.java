import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String socks = br.readLine();
        int white = 0, black = 0;

        for (int i = 0; i < socks.length(); i++) {
            if (socks.charAt(i) == 'B') white++;
            else black++;
        }

        int pairs = (white / 2) + (black / 2);

        bw.write(String.valueOf(pairs));
        bw.newLine();

        br.close();
        bw.close();
    }
}
