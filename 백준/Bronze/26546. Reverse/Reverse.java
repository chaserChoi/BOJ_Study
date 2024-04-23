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
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, startIndex));
            sb.append(str.substring(endIndex));

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
