import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null && !line.equals("#")) {
            char encryptedA = line.charAt(line.length() - 1);

            int shift = encryptedA - 'A';

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < line.length() - 1; i++) {
                char curr = line.charAt(i);

                if (Character.isUpperCase(curr)) {
                    int originalCharPos = (curr - 'A' - shift + 26) % 26;
                    char decrypted = (char) (originalCharPos + 'A');
                    sb.append(decrypted);
                } else if (Character.isLowerCase(curr)) {
                    int originalCharPos = (curr - 'a' - shift + 26) % 26;
                    char decrypted = (char) (originalCharPos + 'a');
                    sb.append(decrypted);
                } else
                    sb.append(curr);
            }

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}