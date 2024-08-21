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
        String s = br.readLine();

        for (int i = 0; i < n; i++) {
            char cur = s.charAt(i);
            sb.append(cur);

            if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == sb.charAt(sb.length() - 2)) {
                char upper = Character.toUpperCase(sb.charAt(sb.length() - 1));
                sb.setLength(sb.length() - 2);
                sb.append(upper).append(upper);
            }
        }

        pw.println(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
