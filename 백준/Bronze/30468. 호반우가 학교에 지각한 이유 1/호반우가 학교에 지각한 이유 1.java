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

        int STR = Integer.parseInt(st.nextToken());
        int DEX = Integer.parseInt(st.nextToken());
        int INT = Integer.parseInt(st.nextToken());
        int LUK = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int totalStats = STR + DEX + INT + LUK;
        int blessings = 0;

        while(true) {
            double avgStats = totalStats / 4.0;
            if(avgStats >= N) break;
            totalStats++;
            blessings++;
        }

        bw.write(Integer.toString(blessings));
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
