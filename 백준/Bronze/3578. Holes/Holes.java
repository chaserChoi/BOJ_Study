import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(br.readLine());

        if (h == 0) bw.write("1\n");
        else if (h == 1) bw.write("0\n");
        else {
            StringBuilder sb = new StringBuilder();
            while (h >= 2) {
                sb.append('8');
                h -= 2;
            }
            if (h == 1) sb.insert(0, '4');
            bw.write(sb.toString() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
