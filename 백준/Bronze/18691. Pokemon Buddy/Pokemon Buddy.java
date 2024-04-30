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

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int G = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            int kmRequired = 0;

            if (E > C) {
                switch (G) {
                    case 1:
                        kmRequired = E - C;
                        break;
                    case 2:
                        kmRequired = 3 * (E - C);
                        break;
                    case 3:
                        kmRequired = 5 * (E - C);
                        break;
                }
            }

            bw.write(kmRequired + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
