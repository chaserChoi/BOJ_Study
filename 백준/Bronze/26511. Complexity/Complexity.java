import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            int[][] freq = new int[26][2];

            for (int i = 0; i < 26; i++) {
                freq[i][0] = 0;
                freq[i][1] = 'a' + i;
            }

            for (char c : s.toCharArray())
                freq[c - 'a'][0]++;

            Arrays.sort(freq, Comparator.comparingInt(a -> -a[0]));

            int ans = 0;
            for (int i = 2; i < 26; i++)
                ans += freq[i][0];

            sb.append(ans).append("\n");
        }

        pw.print(sb);

        pw.flush();
        pw.close();
        br.close();
    }
}
