import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int B = Integer.parseInt(br.readLine());
        int P = 5 * B - 400;

        bw.write(P + "\n");

        if (P < 100) bw.write("1\n");
        else if (P == 100) bw.write("0\n");
        else bw.write("-1\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
