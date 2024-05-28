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

        int rows = (int) Math.sqrt(N);
        int cols = rows;

        while (rows * cols < N) {
            if (rows * cols < N) cols++;

            if (rows * cols < N) rows++;
        }

        bw.write(rows + " " + cols);

        br.close();
        bw.flush();
        bw.close();
    }
}
