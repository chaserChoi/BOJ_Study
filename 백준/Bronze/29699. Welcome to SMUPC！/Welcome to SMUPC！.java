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

        int index = (N - 1) % 14;
        String welcome = "WelcomeToSMUPC";

        bw.write(welcome.charAt(index) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
