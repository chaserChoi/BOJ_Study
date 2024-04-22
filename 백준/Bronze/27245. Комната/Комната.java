import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int w = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());
        int min = Math.min(w, l);
        int max = Math.max(w, l);

        if (min / (double)h >= 2 && max / (double)min <= 2) bw.write("good");
        else bw.write("bad");

        br.close();
        bw.flush();
        bw.close();
    }
}
