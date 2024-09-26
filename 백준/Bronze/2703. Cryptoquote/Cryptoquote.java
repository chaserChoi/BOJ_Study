import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String encrypted = br.readLine();
            String transform = br.readLine();

            StringBuilder sb = new StringBuilder();
            for (char c : encrypted.toCharArray()) {
                if (c >= 'A' && c <= 'Z')
                    sb.append(transform.charAt(c - 'A'));
                else
                    sb.append(c);
            }

            pw.println(sb);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
