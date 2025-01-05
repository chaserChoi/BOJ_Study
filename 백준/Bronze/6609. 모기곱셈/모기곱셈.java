import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        while((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int M = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            for(int i = 0; i < N; i++) {
                int m = M;
                M = P / S;
                P = L / R;
                L = m * E;
            }
            System.out.println(M);
        }
    }
}
