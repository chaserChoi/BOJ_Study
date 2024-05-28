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

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int totalArea = 0;
        int bedroomArea = 0;
        int balconyArea = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int area = Integer.parseInt(st.nextToken());
            String type = st.nextToken();

            totalArea += area;
            if (type.equals("bedroom")) bedroomArea += area;
            if (type.equals("balcony")) balconyArea += area;
        }

        double reducedTotalArea = totalArea - (balconyArea / 2.0);

        double cost = reducedTotalArea * c;

        bw.write(totalArea + "\n");
        bw.write(bedroomArea + "\n");
        bw.write(String.format("%.6f", cost) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
