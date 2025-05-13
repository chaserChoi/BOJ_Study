import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String start = st.nextToken();
            String birth = st.nextToken();
            int course = Integer.parseInt(st.nextToken());

            int startYear = Integer.parseInt(start.substring(0, 4));
            int birthYear = Integer.parseInt(birth.substring(0, 4));

            StringBuilder sb = new StringBuilder();
            sb.append(name).append(" ");

            if (startYear >= 2010 || birthYear >= 1991)
                sb.append("eligible");
            else if (course >= 41)
                sb.append("ineligible");
            else
                sb.append("coach petitions");

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}