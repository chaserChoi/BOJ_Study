import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        if (M % K == 0) bw.write("Yes\n");
        else bw.write("No\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
