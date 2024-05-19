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

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int startH = Integer.parseInt(st.nextToken());
            int startM = Integer.parseInt(st.nextToken());
            int startS = Integer.parseInt(st.nextToken());

            int endH = Integer.parseInt(st.nextToken());
            int endM = Integer.parseInt(st.nextToken());
            int endS = Integer.parseInt(st.nextToken());

            int workH = endH - startH;
            int workM = endM - startM;
            int workS = endS - startS;

            if (workS < 0) {
                workS += 60;
                workM -= 1;
            }
            if (workM < 0) {
                workM += 60;
                workH -= 1;
            }

            bw.write(workH + " " + workM + " " + workS + "\n");
        }

        bw.flush();
        br.close();
        bw.close(); 
    }
}
