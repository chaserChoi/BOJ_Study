import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String init = br.readLine();
            String target = br.readLine();

            int wbMis = 0;
            int bwMis = 0;

            for (int j = 0; j < n; j++) {
                if (init.charAt(j) == 'W' && target.charAt(j) == 'B')
                    wbMis++;
                else if (init.charAt(j) == 'B' && target.charAt(j) == 'W')
                    bwMis++;
            }

            int min = Math.max(wbMis, bwMis);
            sb.append(min).append("\n");
        }

        pw.println(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
