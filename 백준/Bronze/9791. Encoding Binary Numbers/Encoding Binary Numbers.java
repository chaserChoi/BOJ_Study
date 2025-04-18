import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("0"))
                break;

            StringBuilder sb = new StringBuilder();
            char curr = str.charAt(0);
            int cnt = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == curr)
                    cnt++;
                else {
                    sb.append(cnt).append(curr);
                    curr = c;
                    cnt = 1;
                }
            }
            if (cnt > 0)
                sb.append(cnt).append(curr);

            System.out.println(sb.toString());
        }
    }
}
