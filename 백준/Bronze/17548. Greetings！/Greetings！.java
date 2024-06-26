import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int eCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'e') {
                eCount++;
            }
        }

        bw.write("h");

        for (int i = 0; i < eCount * 2; i++) bw.write("e");

        bw.write("y\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
