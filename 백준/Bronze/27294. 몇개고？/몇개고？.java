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
        int T = Integer.parseInt(st.nextToken()); 
        int S = Integer.parseInt(st.nextToken());
        int riceGrains;
        if ((T >= 12 && T <= 16) && S == 0) riceGrains = 320;
        else riceGrains = 280;

        bw.write(String.valueOf(riceGrains));
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }
}
