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
        int[] plannedPages = new int[N];
        int[] studiedPages = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) plannedPages[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) studiedPages[i] = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (studiedPages[i] >= plannedPages[i]) count++;
        }

        bw.write(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }
}
