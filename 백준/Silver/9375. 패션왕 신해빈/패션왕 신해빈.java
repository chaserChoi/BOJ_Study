import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            HashMap<String, Integer> m = new HashMap<>();
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                m.put(type, m.getOrDefault(type, 0) + 1);
            }

            int ans = 1;
            for (var c : m.values())
                ans *= c + 1;

            pw.println(ans - 1);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
