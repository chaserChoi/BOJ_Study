import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        String[] parts = input.split(" ");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        int c = Integer.parseInt(parts[4]);

        if (a + b == c) bw.write("YES");
        else bw.write("NO");

        bw.flush();
        bw.close();
        br.close();
    }
}
