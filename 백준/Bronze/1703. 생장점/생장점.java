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

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if (a == 0) break;

            int leaves = 1;

            for (int i = 0; i < a; i++) {
                int splittingFactor = Integer.parseInt(st.nextToken());
                int prunedBranches = Integer.parseInt(st.nextToken());

                leaves = leaves * splittingFactor - prunedBranches;
            }

            bw.write(leaves + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
