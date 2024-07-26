import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[9];
        int[] maxScrs = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        int total = 0;
        boolean isHacker = false;

        for (int i = 0; i < 9; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            total += scores[i];

            if (scores[i] > maxScrs[i])
                isHacker = true;
        }

        if (isHacker)
            bw.write("hacker\n");
        else if (total >= 100)
            bw.write("draw\n");
        else
            bw.write("none\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
