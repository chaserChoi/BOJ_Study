import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int S = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int cost = 250;

        if (S > A) {
            int additionalHeightNeeded = S - A;
            int additionalIceCreams = (int) Math.ceil((double)additionalHeightNeeded / B);
            cost += additionalIceCreams * 100;
        }

        bw.write(String.valueOf(cost));

        bw.flush();
        bw.close();
        br.close();
    }
}
