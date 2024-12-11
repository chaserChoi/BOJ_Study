import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while (true) {
            line = br.readLine();
            if (line.equals("*")) break;

            boolean[] alphabet = new boolean[26];
            for (char c : line.toCharArray()) {
                if (c >= 'a' && c <= 'z')
                    alphabet[c - 'a'] = true;
            }

            boolean isPangram = true;
            for (boolean used : alphabet) {
                if (!used) {
                    isPangram = false;
                    break;
                }
            }

            if (isPangram)
                bw.write("Y\n");
            else
                bw.write("N\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
