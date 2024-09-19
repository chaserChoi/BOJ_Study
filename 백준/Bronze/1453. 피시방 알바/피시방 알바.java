import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        String[] req = br.readLine().split(" ");

        HashSet<Integer> occ = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(req[i]);

            if (occ.contains(s))
                cnt++;
            else
                occ.add(s);
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
