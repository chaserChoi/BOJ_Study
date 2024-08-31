import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String s = br.readLine();
        int cnt = 0;
        int l = s.length();

        for (int i = 0; i <= l - 4; i++) {
            if (s.substring(i, i + 4).equals("kick"))
                cnt++;
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
