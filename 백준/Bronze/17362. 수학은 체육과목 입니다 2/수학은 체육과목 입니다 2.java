import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        n = (n - 1) % 8;

        if (n == 5) n = 3;
        else if (n == 6) n = 2;
        else if (n == 7) n = 1;

        bw.write(String.valueOf(n + 1));

        bw.flush();
        br.close();
        bw.close();
    }
}
