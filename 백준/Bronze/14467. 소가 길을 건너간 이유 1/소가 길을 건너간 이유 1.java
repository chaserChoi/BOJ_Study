import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] poss = new int[11];
        int cross = 0;

        for (int i = 1; i <= 10; i++)
            poss[i] = -1;

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int cow = Integer.parseInt(line[0]);
            int p = Integer.parseInt(line[1]);

            if (poss[cow] != -1 && poss[cow] != p)
                cross++;

            poss[cow] = p;
        }

        pw.println(cross);

        pw.flush();
        pw.close();
        br.close();
    }
}
