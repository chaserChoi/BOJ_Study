import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder decodedMessage = new StringBuilder();

        String prevWord = st.nextToken();
        decodedMessage.append(prevWord.charAt(0));

        while (st.hasMoreTokens()) {
            String currWord = st.nextToken();
            int lenOfPrevWord = prevWord.length();

            if (lenOfPrevWord > currWord.length()) decodedMessage.append(' ');
            else decodedMessage.append(currWord.charAt(lenOfPrevWord - 1));

            prevWord = currWord;
        }

        bw.write(decodedMessage.toString());
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
