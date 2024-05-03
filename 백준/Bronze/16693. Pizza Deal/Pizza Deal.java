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
        int A1 = Integer.parseInt(st.nextToken());
        int P1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int R1 = Integer.parseInt(st.nextToken());
        int P2 = Integer.parseInt(st.nextToken());

        double areaOfWholePizza = Math.PI * R1 * R1;

        if (A1 / (double)P1 > areaOfWholePizza / (double)P2) bw.write("Slice of pizza");
        else bw.write("Whole pizza");

        br.close();
        bw.flush();
        bw.close();
    }
}
