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

        int maxPeople = 0; 
        int currentPeople = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int off = Integer.parseInt(st.nextToken());
            int on = Integer.parseInt(st.nextToken());

            currentPeople -= off;
            currentPeople += on;

            if (currentPeople > maxPeople) maxPeople = currentPeople;
        }

        bw.write(String.valueOf(maxPeople));
        bw.flush();
        bw.close();
    }
}
