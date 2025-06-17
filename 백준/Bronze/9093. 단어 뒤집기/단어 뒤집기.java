import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreElements()) {
                StringBuilder word = new StringBuilder(st.nextToken());
                sb.append(word.reverse()).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

        br.close();
    }
}
