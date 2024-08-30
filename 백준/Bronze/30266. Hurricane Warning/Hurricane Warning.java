import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        for (int i = 1; i <= k; i++) {
            int n = Integer.parseInt(br.readLine());
            String media = br.readLine();
            HashSet<Character> set = new HashSet<>();

            for (char m : media.toCharArray())
                set.add(m);

            int cnt = 0;

            for (int j = 0; j < n; j++) {
                String consumed = br.readLine();
                for (char m : consumed.toCharArray()) {
                    if (set.contains(m)) {
                        cnt++;
                        break;
                    }
                }
            }

            pw.println("Data Set " + i + ":");
            pw.println(cnt);
            pw.println();
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
