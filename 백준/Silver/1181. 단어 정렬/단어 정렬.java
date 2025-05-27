import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] words = new String[n];
        int[] lengths = new int[n];
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            words[i] = br.readLine();
            lengths[i] = words[i].length();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (lengths[i] > lengths[j]) {
                    int temp1 = lengths[i];
                    String temp2 = words[i];
                    lengths[i] = lengths[j];
                    words[i] = words[j];
                    lengths[j] = temp1;
                    words[j] = temp2;
                    lengths[j] = temp1;
                    words[j] = temp2;
                }
                if (lengths[i] == lengths[j]) {
                    if (words[i].compareTo(words[j]) > 0) {
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
        }

        for (String word : words) {
          if (!result.contains(word)) {
              result.add(word);
              bw.write(word + "\n");
          }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
