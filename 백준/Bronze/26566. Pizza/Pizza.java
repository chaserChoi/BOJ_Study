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

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            double A1 = Double.parseDouble(st.nextToken());
            double P1 = Double.parseDouble(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            double R1 = Double.parseDouble(st.nextToken());
            double P2 = Double.parseDouble(st.nextToken());
            double areaOfWholePizza = Math.PI * R1 * R1;

            if ((A1 / P1) > (areaOfWholePizza / P2)) bw.write("Slice of pizza\n");
            else bw.write("Whole pizza\n");
        }

        bw.flush(); 
        br.close();
        bw.close();
    }
}
