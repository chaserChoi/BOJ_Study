import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] parts = br.readLine().split(" ");
            int d = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            int y = Integer.parseInt(parts[2]);

            if (d == 0 && m == 0 && y == 0) break;

            int shift = (d + m + y) % 25 + 1;
            String line = br.readLine();

            for (char c : line.toCharArray()) {
              if (c >= 'a' && c <= 'z') {
                  char decrypted = (char) (c - shift);
                  if (decrypted < 'a')
                      decrypted += 26;
                  sb.append(decrypted);
              } else
                  sb.append(c);
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}