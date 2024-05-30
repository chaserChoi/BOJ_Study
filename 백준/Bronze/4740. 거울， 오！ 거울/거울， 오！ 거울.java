import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals("***")) break;
            
            String reversed = new StringBuilder(line).reverse().toString();
            bw.write(reversed + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
