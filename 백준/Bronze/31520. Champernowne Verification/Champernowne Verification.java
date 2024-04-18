import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        long num = Long.parseLong(n);
        long count = 0;
        long length = 0;

        for (int i = 1; length < n.length(); i++) {
            length += Math.log10(i) + 1;
            count++;
        }

        StringBuilder champernowneWord = new StringBuilder();
        for (int i = 1; i <= count; i++) champernowneWord.append(i);

        if (champernowneWord.toString().startsWith(n)) bw.write(String.valueOf(count));
        else bw.write("-1");

        bw.flush();
        bw.close();
        br.close();
    }
}
