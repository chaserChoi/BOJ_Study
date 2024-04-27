import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long V_kappa = Long.parseLong(st.nextToken());
        long J_kappa = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long V_lambda = Long.parseLong(st.nextToken());
        long J_lambda = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long V_h = Long.parseLong(st.nextToken());
        long D_h = Long.parseLong(st.nextToken());
        long J_h = Long.parseLong(st.nextToken());

        long totalVariants = ((V_kappa * J_kappa) + (V_lambda * J_lambda)) * V_h * D_h * J_h;

        bw.write(String.valueOf(totalVariants));

        bw.flush();
        br.close();
        bw.close();
    }
}
