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
        String murderer = "";

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (name.contains("S")) {
                murderer = name;
                break;
            }
        }

        bw.write(murderer);
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
