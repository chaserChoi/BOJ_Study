import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int h = Integer.parseInt(line[0]);
        int w = Integer.parseInt(line[1]);

        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < h; i++) {
            String row = br.readLine();
            for (int j = 0; j < w; j++) {
                if (row.charAt(j) == '0') countZero++;
                else countOne++;
            }
        }

        int result = Math.min(countZero, countOne);

        bw.write(Integer.toString(result));
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }
}
