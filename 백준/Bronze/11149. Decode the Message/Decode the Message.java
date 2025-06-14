import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String line = br.readLine();
            String[] words = line.split(" ");
            StringBuilder sb = new StringBuilder();

            for (String word : words) {
              int sum = 0;
              for (char c : word.toCharArray())
                sum += (c - 'a');
              int mod = sum % 27;

              if (mod == 26)
                  sb.append(" ");
              else
                  sb.append((char) ('a' + mod));
            }

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}