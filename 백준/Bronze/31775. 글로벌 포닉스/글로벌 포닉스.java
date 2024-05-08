import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] check = new boolean[3];

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            char startChar = s.charAt(0);

            if (startChar == 'l') check[0] = true;
            if (startChar == 'k') check[1] = true;
            if (startChar == 'p') check[2] = true;
        }

        if (check[0] && check[1] && check[2]) bw.write("GLOBAL");
        else bw.write("PONIX");

        bw.flush();
        br.close();
        bw.close();
    }
}
