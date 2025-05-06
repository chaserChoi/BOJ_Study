import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            StringTokenizer st = new StringTokenizer(line, " = ");
            String type = st.nextToken();
            double concentration = Double.parseDouble(st.nextToken());

            double pH;

            if (type.equals("H"))
                pH = -Math.log10(concentration);
            else {
                double pOH = -Math.log10(concentration);
                pH = 14.0 - pOH;
            }

            double roundedpH = Math.round(pH * 100.0) / 100.0;

            bw.write(String.format("%.2f", roundedpH));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}