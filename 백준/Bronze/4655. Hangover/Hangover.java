import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            double c = Double.parseDouble(br.readLine());
            if (c == 0.00) break;

            int numCards = 0;
            double overhang = 0.0;

            while (overhang < c) {
                numCards++; 
                overhang += 1.0 / (numCards + 1); 
            }

            bw.write(numCards + " card(s)\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
