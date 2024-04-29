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
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        double walkTime = L / A + (double) M / G;
        double standTime = R / B + (double) M / S;

        if (walkTime < standTime) bw.write("friskus\n");
        else bw.write("latmask\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
