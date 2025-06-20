import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int k;
    static int[] S;
    static int[] selected = new int[6];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        boolean first = true;

        while (!(line = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(line);
            k = Integer.parseInt(st.nextToken());

            S = new int[k];
            for (int i = 0; i < k; i++)
                S[i] = Integer.parseInt(st.nextToken());

            if (!first) sb.append('\n');
            first = false;

            lotto(0, 0);
        }

        System.out.print(sb);
    }

    static void lotto(int start, int depth) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++)
                sb.append(selected[i]).append(' ');
            sb.append('\n');
            return;
        }

        for (int i = start; i < k; i++) {
            selected[depth] = S[i];
            lotto(i + 1, depth + 1);
        }
    }
}
