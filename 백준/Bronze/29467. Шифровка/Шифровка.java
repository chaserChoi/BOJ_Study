import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        String max = "";

        for (int i = 0; i < s.length(); i++) {
            String cur = s.substring(i);

            if (cur.compareTo(max) > 0)
                max = cur;
        }

        pw.println(max);

        pw.flush();
        pw.close();
        br.close();
    }
}
