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

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(st.nextToken());
            int section;

            if (M == 300) section = 1;
            else if (M >= 275) section = 2;
            else if (M >= 250) section = 3;
            else section = 4;

            bw.write(section + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
