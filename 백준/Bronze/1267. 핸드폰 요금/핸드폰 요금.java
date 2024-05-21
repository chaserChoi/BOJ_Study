import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int yTotal = 0;
        int mTotal = 0;

        for (int i = 0; i < N; i++) {
            int callDuration = Integer.parseInt(st.nextToken());

            yTotal += ((callDuration / 30) + 1) * 10;

            mTotal += ((callDuration / 60) + 1) * 15;
        }

        if (yTotal < mTotal) bw.write("Y " + yTotal + "\n");
        else if (yTotal > mTotal) bw.write("M " + mTotal + "\n");
        else bw.write("Y M " + yTotal + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
