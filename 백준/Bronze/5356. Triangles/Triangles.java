import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            char s = input[1].charAt(0);

            for (int j = 1; j <= n; j++) {
                for (int k = 0; k < j; k++) bw.write(s);
                bw.newLine();

                if (s == 'Z') s = 'A';
                else s = (char) (s + 1);
            }

            if (i != T - 1) bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close(); 
    }
}
