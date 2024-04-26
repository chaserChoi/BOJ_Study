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
            StringTokenizer st = new StringTokenizer(input);
            int count = 0;

            while (st.hasMoreTokens()) {
                if (Integer.parseInt(st.nextToken()) >= 10) count++;
            }

            bw.write(input + "\n");

            switch (count) {
                case 0:
                    bw.write("zilch\n\n");
                    break;
                case 1:
                    bw.write("double\n\n");
                    break;
                case 2:
                    bw.write("double-double\n\n");
                    break;
                case 3:
                    bw.write("triple-double\n\n");
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
