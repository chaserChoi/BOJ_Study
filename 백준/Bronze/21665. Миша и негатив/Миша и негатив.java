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

        char[][] originalImage = new char[n][m];
        char[][] negativeImage = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) originalImage[i][j] = line.charAt(j);
        }

        br.readLine();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) negativeImage[i][j] = line.charAt(j);
        }

        int errorCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((originalImage[i][j] == 'B' && negativeImage[i][j] != 'W') || (originalImage[i][j] == 'W' && negativeImage[i][j] != 'B')) {
                    errorCount++;
                }
            }
        }

        bw.write(String.valueOf(errorCount));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
