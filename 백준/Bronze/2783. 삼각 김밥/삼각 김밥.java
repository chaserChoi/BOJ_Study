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

        double X = Double.parseDouble(st.nextToken());
        double Y = Double.parseDouble(st.nextToken());

        double minPrice = (X / Y) * 1000;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            double Xi = Double.parseDouble(st.nextToken());
            double Yi = Double.parseDouble(st.nextToken());

            double price = (Xi / Yi) * 1000;
            if (price < minPrice) minPrice = price;
        }

        bw.write(String.format("%.2f", minPrice));

        br.close();
        bw.flush();
        bw.close();
    }
}
