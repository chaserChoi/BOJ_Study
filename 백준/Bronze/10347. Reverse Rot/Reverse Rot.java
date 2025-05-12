import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
    private static final int ALPHABET_LENGTH = ALPHABET.length();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line;

        while ((line = br.readLine()) != null) {
            if (line.equals("0"))
                break;

            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            String input = st.nextToken();

            String reverse = new StringBuilder(input).reverse().toString();

            StringBuilder sb = new StringBuilder();
            for (char c : reverse.toCharArray()) {
              int index = ALPHABET.indexOf(c);

              int newIdx = (index + n) % ALPHABET_LENGTH;

              char encrypted = ALPHABET.charAt(newIdx);

              sb.append(encrypted);
            }

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}