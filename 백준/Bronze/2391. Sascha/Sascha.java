import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String pron = br.readLine();
            int w = Integer.parseInt(br.readLine());

            String best = null;
            int minSubstitutions = Integer.MAX_VALUE;

            for (int j = 0; j < w; j++) {
                String dict = br.readLine();
                int substitutions = cntSubstitutions(pron, dict);

                if (substitutions < minSubstitutions) {
                    minSubstitutions = substitutions;
                    best = dict;
                }
            }

            sb.append(best).append("\n");
        }

        pw.print(sb);

        pw.flush();
        pw.close();
        br.close();
    }

    private static int cntSubstitutions(String pron, String dict) {
        int cnt = 0;
        for (int i = 0; i < pron.length(); i++) {
            if (pron.charAt(i) != dict.charAt(i))
                cnt++;
        }

        return cnt;
    }
}
