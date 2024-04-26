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
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            boolean mack = false, zack = false;

            bw.write(input + "\n");

            while (st.hasMoreTokens()) {
                int jerseyNumber = Integer.parseInt(st.nextToken());
                if (jerseyNumber == 18) mack = true;
                if (jerseyNumber == 17) zack = true;
            }

            if (mack && zack) bw.write("both\n\n");
            else if (mack) bw.write("mack\n\n");
            else if (zack) bw.write("zack\n\n");
            else bw.write("none\n\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
