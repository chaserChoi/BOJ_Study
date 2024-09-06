import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        String[] line = br.readLine().split(" ");
        long x = Long.parseLong(line[0]);
        long s = Long.parseLong(line[1]);

        boolean canAdventure = false;

        for (int i = 0; i < n; i++) {
            String[] weapon = br.readLine().split(" ");
            long c = Long.parseLong(weapon[0]);
            long p = Long.parseLong(weapon[1]);

            if (c <= x && p > s)
                canAdventure = true;
        }

        if (canAdventure)
            pw.println("YES");
        else
            pw.println("NO");

        pw.flush();
        pw.close();
        br.close();
    }
}
