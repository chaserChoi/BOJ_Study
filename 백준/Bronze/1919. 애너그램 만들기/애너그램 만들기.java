import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String word1 = br.readLine();
        String word2 = br.readLine();

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        for (char c : word1.toCharArray())
            cnt1[c - 'a']++;

        for (char c : word2.toCharArray())
            cnt2[c - 'a']++;

        int removal = 0;
        for (int i = 0; i < 26; i++)
            removal += Math.abs(cnt1[i] - cnt2[i]);

        pw.println(removal);

        pw.flush();
        pw.close();
        br.close();
    }
}
