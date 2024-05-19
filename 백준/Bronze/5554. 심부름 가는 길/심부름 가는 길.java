import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalTime = 0;

        for (int i = 0; i < 4; i++) totalTime += Integer.parseInt(br.readLine());

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        bw.write(minutes + "\n" + seconds);

        bw.flush();
        br.close();
        bw.close();
    }
}
