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
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int maxH = Math.max(h, n - h);
        int maxV = Math.max(v, n - v);
        int volume = maxH * maxV * 4;

        bw.write(String.valueOf(volume));

        bw.flush();
        br.close();
        bw.close();
    }
}
