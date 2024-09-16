import java.io.*;

// BOJ 1212 8진수 2진수

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int n = c - '0';
            String bin = String.format("%03d", Integer.parseInt(Integer.toBinaryString(n)));
            sb.append(bin);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        pw.println(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
