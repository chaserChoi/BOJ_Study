import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String keyword = br.readLine();
        String message = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c))
                sb.append(c);
        }

        String encodedMessage = encodeMessage(sb.toString(), keyword);
        System.out.println(encodedMessage);
    }

    private static String encodeMessage(String message, String keyword) {
        StringBuilder sb = new StringBuilder();
        int keywordLen = keyword.length();

        for (int i = 0; i < message.length(); i++) {
            char mChar = message.charAt(i);
            char kChar = keyword.charAt(i % keywordLen);

            int shift = kChar - 'A';
            char encodedChar = (char) (((mChar - 'A' + shift) % 26) + 'A');

            sb.append(encodedChar);
        }

        return sb.toString();
    }
}

