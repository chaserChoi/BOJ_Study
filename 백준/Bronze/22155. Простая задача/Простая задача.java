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

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int branchOperators = Integer.parseInt(st.nextToken());
            int loopOperators = Integer.parseInt(st.nextToken());

            if ((branchOperators <= 2 && loopOperators <= 1) || (branchOperators <= 1 && loopOperators <= 2)) {
                bw.write("Yes\n");
            } else bw.write("No\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
