import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double d = Double.parseDouble(st.nextToken());
        double s = Double.parseDouble(st.nextToken());

        double total = d * n;
        double solved = s * k;
        double remain = total - solved;
        int remainProb = n - k;

        double avg = remain / remainProb;

        if (remainProb <= 0 || avg < 0 || avg > 100)
            bw.write("impossible");
        else
            bw.write(String.format("%.10f\n", avg));

        bw.flush();
        bw.close();
        br.close();
    }
}
