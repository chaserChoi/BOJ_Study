import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        String S = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            if (S.charAt(i) == 'J')
                sb.append(S.charAt(i - 1)).append("\n");
        }

        pw.println(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
