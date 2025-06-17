import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            set.add(str);
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            String str2 = br.readLine();
            if (set.contains(str2))
                cnt++;
        }

        sb.append(cnt);
        System.out.println(sb);

        br.close();
    }
}
