import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());
        String res = br.readLine().trim();

        int cntB = 0, cntS = 0, cntA = 0;

        for (int i = 0; i < n; i++) {
            char r = res.charAt(i);
            if (r == 'B')
                cntB++;
            else if (r == 'S')
                cntS++;
            else if (r == 'A')
                cntA++;
        }

        int max = Math.max(cntB, Math.max(cntS, cntA));
        StringBuilder ans = new StringBuilder();

        if (cntB == max)
            ans.append("B");
        if (cntS == max)
            ans.append("S");
        if (cntA == max)
            ans.append("A");

        if (ans.length() == 3)
            pw.println("SCU");
        else
            pw.println(ans.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
