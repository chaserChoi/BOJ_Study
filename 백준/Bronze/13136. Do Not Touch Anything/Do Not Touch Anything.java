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
        
        double R = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());
        double N = Double.parseDouble(st.nextToken());

        long rowCameras = (long) Math.ceil(R / N);
        long colCameras = (long) Math.ceil(C / N);
        long totalCameras = rowCameras * colCameras;

        bw.write(String.valueOf(totalCameras));

        bw.flush();
        bw.close();
        br.close();
    }
}
