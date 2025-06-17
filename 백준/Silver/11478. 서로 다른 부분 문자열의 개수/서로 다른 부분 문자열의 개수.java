import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        Set<String> set = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (set.contains(sub))
                    continue;
                else {
                    set.add(sub);
                    cnt++;
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);

        br.close();
    }
}
