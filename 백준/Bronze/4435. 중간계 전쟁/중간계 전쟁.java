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

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] goodForces = {1, 2, 3, 3, 4, 10};
            int goodScore = 0;
            for (int j = 0; j < goodForces.length; j++) goodScore += Integer.parseInt(st.nextToken()) * goodForces[j];

            st = new StringTokenizer(br.readLine());
            int[] evilForces = {1, 2, 2, 2, 3, 5, 10};
            int evilScore = 0;
            for (int j = 0; j < evilForces.length; j++) evilScore += Integer.parseInt(st.nextToken()) * evilForces[j];

            bw.write("Battle " + i + ": ");
            if (goodScore > evilScore) bw.write("Good triumphs over Evil\n");
            else if (goodScore < evilScore) bw.write("Evil eradicates all trace of Good\n");
            else bw.write("No victor on this battle field\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
