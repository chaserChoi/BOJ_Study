import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            StringBuilder sb = new StringBuilder();

            sb.append(input.charAt(0));

            for (int j = 1; j < input.length(); j++) {
                if (input.charAt(j) != input.charAt(j - 1)) sb.append(input.charAt(j));
            }

            bw.write(sb.toString());
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
