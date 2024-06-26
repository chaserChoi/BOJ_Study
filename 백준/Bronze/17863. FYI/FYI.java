import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String phoneNumber = br.readLine();

        if (phoneNumber.startsWith("555")) bw.write("YES");
        else bw.write("NO");

        bw.flush();
        bw.close();
        br.close();
    }
}
