import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line;
        while ((line = br.readLine()) != null && !line.equals("# #")) {
            st = new StringTokenizer(line);
            String p1 = st.nextToken();
            String p2 = st.nextToken();

            int n = Integer.parseInt(br.readLine());

            int p1Score = 0;
            int p2Score = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                char call = st.nextToken().charAt(0);
                char result = st.nextToken().charAt(0);

                if (call == result)
                    p1Score++;
                else
                    p2Score++;
            }

            bw.write(p1 + " " + p1Score + " " + p2 + " " + p2Score);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}