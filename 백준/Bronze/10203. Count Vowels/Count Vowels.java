import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        String vowels = "aeiou";

        for (int i = 0; i < t; i++) {
            String word = br.readLine();
            int cnt = 0;

            for (char c : word.toCharArray()) {
                if (vowels.indexOf(c) != -1)
                    cnt++;
            }

            bw.write(String.format("The number of vowels in %s is %d.%n", word, cnt));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
