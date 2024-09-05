import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine().trim());
        String[] words = new String[n];
        for (int i = 0; i < n; i++)
            words[i] = br.readLine().trim();

        int max = 0;
        for (String w : words)
            max = Math.max(max, w.length());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < max; i++) {
            int sum = 0;
            int cnt = 0;

            for (String w : words) {
                if (i < w.length()) {
                    sum += w.charAt(i);
                    cnt++;
                }
            }

            if (cnt > 0) {
                char mean = (char) (sum / cnt);
                sb.append(mean);
            }
        }

        pw.println(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
