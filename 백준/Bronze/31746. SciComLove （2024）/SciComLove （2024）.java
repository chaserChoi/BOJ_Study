import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String original = "SciComLove";
        String reversed = new StringBuilder(original).reverse().toString();

        if (N % 2 == 1) bw.write(reversed);
        else bw.write(original);

        bw.flush();
        bw.close();
        br.close();
    }
}
