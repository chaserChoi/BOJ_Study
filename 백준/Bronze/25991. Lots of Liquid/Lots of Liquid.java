import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double totalVolume = 0;
        for (int i = 0; i < n; i++) {
            double side = Double.parseDouble(st.nextToken());
            totalVolume += Math.pow(side, 3);
        }

        double sideLength = Math.cbrt(totalVolume);

        DecimalFormat df = new DecimalFormat("#.######");
        String formattedSideLength = df.format(sideLength);

        bw.write(formattedSideLength);
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }
}
