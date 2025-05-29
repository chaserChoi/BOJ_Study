import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean[] isVisited = new boolean[26];
            String str = br.readLine();
            boolean isGroupWord = true;
            char prevChar = ' ';

            for (char c : str.toCharArray()) {
              if (c != prevChar) {
                  if (isVisited[c - 'a']) {
                      isGroupWord = false;
                      break;
                  }
                  isVisited[c - 'a'] = true;
                  prevChar = c;
              }
            }

            if (isGroupWord)
                cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
