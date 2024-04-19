import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int px = Integer.parseInt(st.nextToken());
        int rx = Integer.parseInt(st.nextToken());
        double vx = (double)px / rx;

        if (vx < 0.2) bw.write("weak");
        else if (vx < 0.4) bw.write("normal");
        else if (vx < 0.6) bw.write("strong");
        else bw.write("very strong");

        bw.flush();
        bw.close();
        br.close();
    }
}
