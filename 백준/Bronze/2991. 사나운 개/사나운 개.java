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
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] times = {P, M, N};
        for (int time : times) {
            int attacks = 0;
            if (time % (A + B) > 0 && time % (A + B) <= A) attacks++;

            if (time % (C + D) > 0 && time % (C + D) <= C) attacks++;

            bw.write(attacks + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
