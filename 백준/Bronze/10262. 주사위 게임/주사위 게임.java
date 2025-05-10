import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int ga1 = Integer.parseInt(st.nextToken());
        int gb1 = Integer.parseInt(st.nextToken());
        int ga2 = Integer.parseInt(st.nextToken());
        int gb2 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int ea1 = Integer.parseInt(st.nextToken());
        int eb1 = Integer.parseInt(st.nextToken());
        int ea2 = Integer.parseInt(st.nextToken());
        int eb2 = Integer.parseInt(st.nextToken());
        
        int[] gunnarFreq = new int[201];
        int[] emmaFreq = new int[201];

        for (int g1 = ga1; g1 <= gb1; g1++) {
            for (int g2 = ga2; g2 <= gb2; g2++)
                gunnarFreq[g1 + g2]++;
        }

        for (int e1 = ea1; e1 <= eb1; e1++) {
            for (int e2 = ea2; e2 <= eb2; e2++)
                emmaFreq[e1 + e2]++;
        }

        int gunnarWins = 0;
        int emmaWins = 0;

        for (int gSum = 0; gSum <= 200; gSum++) {
            if (gunnarFreq[gSum] > 0) {
                for (int eSum = 0; eSum <= 200; eSum++) {
                    if (emmaFreq[eSum] > 0) {
                        if (gSum > eSum)
                            gunnarWins += gunnarFreq[gSum] * emmaFreq[eSum];
                        else if (eSum > gSum)
                            emmaWins += gunnarFreq[gSum] * emmaFreq[eSum];
                    }
                }
            }
        }

        if (gunnarWins > emmaWins)
            bw.write("Gunnar");
        else if (gunnarWins < emmaWins)
            bw.write("Emma");
        else
            bw.write("Tie");
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}