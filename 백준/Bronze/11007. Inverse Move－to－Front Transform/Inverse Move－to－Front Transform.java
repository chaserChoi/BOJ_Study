import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            List<Character> list = new ArrayList<>();
            for (char j = 'a'; j <= 'z'; j++)
                list.add(j);

            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                int idx = Integer.parseInt(st.nextToken());

                char decoded = list.get(idx);

                sb.append(decoded);

                list.remove(idx);
                list.add(0, decoded);
            }

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
