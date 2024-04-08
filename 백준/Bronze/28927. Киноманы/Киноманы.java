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
        int t1 = Integer.parseInt(st.nextToken());
        int e1 = Integer.parseInt(st.nextToken());
        int f1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int t2 = Integer.parseInt(st.nextToken());
        int e2 = Integer.parseInt(st.nextToken());
        int f2 = Integer.parseInt(st.nextToken());

        int totalTimeMax = t1 * 3 + e1 * 20 + f1 * 120;
        int totalTimeMel = t2 * 3 + e2 * 20 + f2 * 120;

        if (totalTimeMax > totalTimeMel) bw.write("Max");
        else if (totalTimeMax < totalTimeMel) bw.write("Mel");
        else bw.write("Draw");

        bw.flush();
        bw.close();
        br.close();
    }
}
