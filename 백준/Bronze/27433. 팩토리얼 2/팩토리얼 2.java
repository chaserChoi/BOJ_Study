import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static long factorial(int N) {
        if (N <= 1) return 1;
        return N * factorial(N - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long result = factorial(N);

        bw.write(Long.toString(result));

        bw.flush();
        br.close();
        bw.close();
    }
}
