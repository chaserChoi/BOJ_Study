import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int[] v = new int[4];
            String[] line = br.readLine().split(" ");
            for (int i = 0; i < 4; i++)
                v[i] = Integer.parseInt(line[i]);
            Arrays.sort(v);

            if ((v[0] == 0 && v[1] == 1 && v[2] == 2 && v[3] == 3) ||
                    (v[0] == 0 && v[1] == 1 && v[2] == 4 && v[3] == 5) ||
                    (v[0] == 0 && v[1] == 2 && v[2] == 4 && v[3] == 6) ||
                    (v[0] == 1 && v[1] == 3 && v[2] == 5 && v[3] == 7) ||
                    (v[0] == 2 && v[1] == 3 && v[2] == 6 && v[3] == 7) ||
                    (v[0] == 4 && v[1] == 5 && v[2] == 6 && v[3] == 7)) {
                sb.append("YES\n");
            } else
                sb.append("NO\n");
        }

        pw.print(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
