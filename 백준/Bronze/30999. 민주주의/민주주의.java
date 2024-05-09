import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int count = 0;

        for (int i = 0; i < N; i++) {
            String opinions = br.readLine();
            int yes = 0;

            for (int j = 0; j < M; j++) {
                if (opinions.charAt(j) == 'O') yes++;
            }

            if (yes > M / 2) count++;
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
