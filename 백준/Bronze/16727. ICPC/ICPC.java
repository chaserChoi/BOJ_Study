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
        int p1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int s2 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());

        int totalPersepolis = p1 + p2;
        int totalEsteghlal = s1 + s2;

        if (totalPersepolis > totalEsteghlal) bw.write("Persepolis");
        else if (totalPersepolis < totalEsteghlal) bw.write("Esteghlal");
        else {
            if (p2 > s1) bw.write("Persepolis");
            else if (p2 < s1) bw.write("Esteghlal");
            else bw.write("Penalty");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
