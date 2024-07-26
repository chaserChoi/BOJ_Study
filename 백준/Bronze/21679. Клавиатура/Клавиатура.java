import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] dur = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            dur[i] = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(br.readLine());

        int[] click = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            int keyIdx = Integer.parseInt(st.nextToken()) - 1;
            click[keyIdx]++;
        }

        for (int i = 0; i < n; i++) {
            if (click[i] > dur[i])
                bw.write("yes\n");
            else
                bw.write("no\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
