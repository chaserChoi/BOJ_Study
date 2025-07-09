import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String plain = br.readLine();

            for (int j = 0; j < plain.length(); j++) {
                char ch = plain.charAt(j);
                int x = ch - 'A';
                int y = (a * x + b) % 26;
                sb.append((char) ('A' + y));
            }
            sb.append('\n');
        }

        System.out.println(sb);

        br.close();
    }
}