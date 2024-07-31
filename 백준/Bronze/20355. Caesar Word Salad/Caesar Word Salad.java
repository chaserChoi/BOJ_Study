import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String w = br.readLine();
        int cnt = 0;

        for (int i = 0; i < 26; i++) {
            boolean flag = false;

            for (char c : w.toCharArray()) {
                char encoded = (char) ((c - 'a' + i) % 26 + 'a');
                if (encoded == 'i') {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                cnt++;
        }

        if (cnt > 0)
            pw.println(cnt);
        else
            pw.println("impossible");

        pw.flush();
        pw.close();
        br.close();
    }
}
