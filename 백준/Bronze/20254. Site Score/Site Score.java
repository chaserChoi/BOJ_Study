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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int UR = Integer.parseInt(st.nextToken());
        int TR = Integer.parseInt(st.nextToken());
        int UO = Integer.parseInt(st.nextToken());
        int TO = Integer.parseInt(st.nextToken());
        
        int siteScore = 56 * UR + 24 * TR + 14 * UO + 6 * TO;
        
        bw.write(String.valueOf(siteScore));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
