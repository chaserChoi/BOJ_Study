import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double w = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());

        double rectangleCut = w + h;
        double diagonalCut = Math.sqrt(w * w + h * h);

        double difference = rectangleCut - diagonalCut;

        bw.write(String.format("%f", difference).replaceAll("[.]0+$", ""));

        bw.flush();
        bw.close();
        br.close();
    }
}
