import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();

            if (input.equals("END")) break;

            String reversed = new StringBuilder(input).reverse().toString();
            bw.write(reversed + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
