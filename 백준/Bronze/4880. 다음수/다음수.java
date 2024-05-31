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
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            if (a1 == 0 && a2 == 0 && a3 == 0) break;

            if (a2 - a1 == a3 - a2) {
                int next = a3 + (a3 - a2);
                bw.write("AP " + next + "\n");
            }
            
            else if (a2 / a1 == a3 / a2) {
                int next = a3 * (a3 / a2);
                bw.write("GP " + next + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
