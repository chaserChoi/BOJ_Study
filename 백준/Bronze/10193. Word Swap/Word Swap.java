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
            String word1 = st.nextToken();
            String word2 = st.nextToken();

            int total = 0;

            int length = word1.length();
            for (int j = 0; j < length; j++)
                total += word1.charAt(j) - word2.charAt(j);

            StringBuilder sb = new StringBuilder();
            sb.append("Swapping letters to make ").append(word1).append(" look like ").append(word2).append(" ");

            if (total > 0)
                sb.append("earned ").append(total).append(" coins.");
            else if (total < 0)
                sb.append("cost ").append(-total).append(" coins.");
            else
                sb.append("was FREE.");

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}