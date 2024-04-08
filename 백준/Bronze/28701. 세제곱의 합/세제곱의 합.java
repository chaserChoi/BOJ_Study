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

        int sum = N * (N + 1) / 2;

        long squareOfSum = (long) sum * sum;

        long sumOfCubes = squareOfSum;
        bw.write(sum + "\n" + squareOfSum + "\n" + sumOfCubes);

        bw.flush();
        bw.close();
        br.close();
    }
}
