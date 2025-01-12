import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        String encoded = br.readLine();
        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < encoded.length(); i++) {
            char curr = encoded.charAt(i);
            int pos = i + 1;
            int shift = 3 * pos + k;

            int decodedChar = (curr - 'A' - shift + 26) % 26 + 'A';
            decoded.append((char) decodedChar);
        }

        System.out.println(decoded.toString());
    }
}

