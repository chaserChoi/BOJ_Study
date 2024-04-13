import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNumber = 1;

        while (true) {
            String line = br.readLine();
            if (line.equals("0")) break;
            bw.write("Case " + caseNumber++ + ": Sorting... done!\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
