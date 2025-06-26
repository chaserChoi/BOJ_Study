import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(0);
            br.close();
            return;
        }

        while (n > 0) {
            int r = n % b;
            n /= b;
            if (r > 9)
                sb.append((char) (r - 10 + 'A'));
            else
                sb.append(r);
        }

        System.out.println(sb.reverse());

        br.close();
    }
}
