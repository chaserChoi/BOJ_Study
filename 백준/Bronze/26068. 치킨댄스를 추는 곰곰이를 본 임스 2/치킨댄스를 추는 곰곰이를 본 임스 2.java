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

        int count = 0;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            int validDays = Integer.parseInt(input.substring(2));

            if (validDays <= 90) count++;
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }
}
