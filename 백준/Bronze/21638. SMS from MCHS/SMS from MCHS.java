import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int v1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int t2 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        if (t2 < 0 && v2 >= 10) bw.write("A storm warning for tomorrow! Be careful and stay home if possible!");
        else if (t2 < t1) bw.write("MCHS warns! Low temperature is expected tomorrow.");
        else if (v2 > v1) bw.write("MCHS warns! Strong wind is expected tomorrow.");
        else bw.write("No message");

        bw.flush();
        bw.close();
        br.close();
    }
}
