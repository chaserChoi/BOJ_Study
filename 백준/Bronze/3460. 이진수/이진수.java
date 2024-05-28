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
            int n = Integer.parseInt(br.readLine()); 

            StringBuilder result = new StringBuilder();
            int position = 0;

            while (n > 0) {
                if ((n & 1) == 1) result.append(position).append(" ");
                n >>= 1; 
                position++;
            }

            bw.write(result.toString().trim() + "\n"); 
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
