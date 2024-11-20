import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().trim().split(" ");
            String keyword = input[0];
            String plain = input[1];

            String cipher = encrypt(keyword, plain);
            sb.append("Ciphertext: ").append(cipher).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static String encrypt(String keyword, String plain) {
        StringBuilder sb = new StringBuilder();
        int len = keyword.length();

        for (int i = 0; i < plain.length(); i++) {
            char p = plain.charAt(i);
            char k = keyword.charAt(i % len);

            int shifted = (p - 'A' + (k - 'A')) % 26;
            sb.append((char) (shifted + 'A'));
        }

        return sb.toString();
    }
}
