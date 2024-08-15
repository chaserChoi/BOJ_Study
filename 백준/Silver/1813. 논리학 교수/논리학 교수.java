import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] cnts = new int[n];

        for (int i = 0; i < n; i++)
            cnts[i] = Integer.parseInt(line[i]);

        int ans = -1;
        for (int i = 0; i <= n; i++) {
            int cur = 0;
            for (int j = 0; j < n; j++) {
                if (cnts[j] == i)
                    cur++;
            }

            if (cur == i)
                ans = i;
        }

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}
