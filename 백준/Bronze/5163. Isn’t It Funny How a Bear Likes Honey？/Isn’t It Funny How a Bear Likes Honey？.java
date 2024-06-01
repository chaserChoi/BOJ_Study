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

        double PI = 3.14159265359;

        int k = Integer.parseInt(br.readLine());

        for (int i = 1; i <= k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int balloonNum = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());
            double totalHelium = 0;

            for (int j = 1; j <= balloonNum; j++) {
                double radius = Double.parseDouble(br.readLine());
                totalHelium += 4.0 / 3.0 * PI * Math.pow(radius, 3) / 1000;
            }

            bw.write("Data Set " + i + ":\n");
            if (totalHelium >= weight) bw.write("Yes\n\n");
            else bw.write("No\n\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
