import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean foundFBI = false;
        for (int i = 1; i <= 5; i++) {
            String name = br.readLine();
            if (name.contains("FBI")) {
                bw.write(i + " ");
                foundFBI = true;
            }
        }

        if (!foundFBI) bw.write("HE GOT AWAY!");

        br.close();
        bw.flush();
        bw.close();
    }
}
