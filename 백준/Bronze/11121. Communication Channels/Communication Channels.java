import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] inputOutput = br.readLine().split(" ");
            String input = inputOutput[0];
            String output = inputOutput[1];

            if (input.equals(output)) bw.write("OK\n");
            else bw.write("ERROR\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
