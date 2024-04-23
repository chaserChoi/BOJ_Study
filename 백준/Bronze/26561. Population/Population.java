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

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long p = Long.parseLong(st.nextToken());
            long t = Long.parseLong(st.nextToken());

            long birth = t / 4;
            long death = t / 7;
            long finalPopulation = p + birth - death;

            bw.write(finalPopulation + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
