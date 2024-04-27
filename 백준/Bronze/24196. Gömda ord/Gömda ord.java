import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String encrypted = br.readLine();
        StringBuilder decrypted = new StringBuilder();

        int index = 0;
        while (index < encrypted.length()) {
            char currentChar = encrypted.charAt(index);
            decrypted.append(currentChar);
            index += (currentChar - 'A') + 1;
        }

        bw.write(decrypted.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
