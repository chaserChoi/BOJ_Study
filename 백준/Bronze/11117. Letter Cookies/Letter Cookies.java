import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int[] letterCnt = new int[26];
            String letters = br.readLine();

            for (char c : letters.toCharArray())
              letterCnt[c - 'A']++;

            int w = Integer.parseInt(br.readLine());

            for (int j = 0; j < w; j++) {
                String word = br.readLine();
                int[] wordCnt = new int[26];

                for (char c : word.toCharArray())
                  wordCnt[c - 'A']++;

                boolean canSpell = true;
                for (int k = 0; k < 26; k++) {
                    if (wordCnt[k] > letterCnt[k]) {
                        canSpell = false;
                        break;
                    }
                }

                bw.write(canSpell ? "YES\n" : "NO\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
