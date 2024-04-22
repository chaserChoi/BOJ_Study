import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String k = br.readLine();
        String trimmedK = k.replaceAll("0*$", "");
        int beauty = trimmedK.length() - trimmedK.replaceAll("0", "").length();

        bw.write(String.valueOf(beauty));

        br.close();
        bw.flush();
        bw.close();
    }
}
