import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        double[] values = new double[4];
        values[0] = (double)A / C + (double)B / D;
        values[1] = (double)C / D + (double)A / B;
        values[2] = (double)D / B + (double)C / A;
        values[3] = (double)B / A + (double)D / C;

        double max = values[0];
        int maxIndex = 0;
        for (int i = 1; i < 4; i++) {
            if (values[i] > max) {
                max = values[i];
                maxIndex = i;
            }
        }

        bw.write(String.valueOf(maxIndex));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
