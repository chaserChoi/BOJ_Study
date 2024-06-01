import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            int sum = 0, cnt = 1;
            for(int i = 0; i < n; i++, cnt += 2) sum += cnt;
            bw.write(n + " => " + (sum - n + 1) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
