import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String S = br.readLine();

            boolean[] present = new boolean[26];
            for(char c : S.toCharArray()) present[c - 'A'] = true;

            int sum = 0;
            for(int j = 0; j < 26; j++) if(!present[j]) sum += (j + 'A');

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
