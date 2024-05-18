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
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = M - 1; j >= 0; j--) bw.write(row.charAt(j));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
