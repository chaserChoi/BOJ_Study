import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int result;
        if (m == 1 || n == 1) result = m * n;
        else result = (m * 2) + (n * 2) - 4;

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
