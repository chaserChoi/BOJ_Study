import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int g = Integer.parseInt(inputs[0]);
        int p = Integer.parseInt(inputs[1]);
        int t = Integer.parseInt(inputs[2]);

        int individualTests = g * p;
        int groupTests = g + (t * p);

        if (individualTests < groupTests) bw.write("1\n");
        else if (individualTests > groupTests) bw.write("2\n");
        else bw.write("0\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
