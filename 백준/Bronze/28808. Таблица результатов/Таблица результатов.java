import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int solved = 0;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line.contains("+")) solved++;
        }

        bw.write(String.valueOf(solved));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
