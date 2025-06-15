import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] freq = new int[26];

        for (char c : input.toCharArray())
          freq[c - 'a']++;

        int oddCnt = 0;
        for (int i : freq) {
          if (i % 2 == 1)
              oddCnt++;
        }

        int toRemove = (oddCnt == 0) ? 0 : oddCnt - 1;

        bw.write(String.valueOf(toRemove));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}