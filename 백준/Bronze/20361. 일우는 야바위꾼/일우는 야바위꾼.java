import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);
        int k = Integer.parseInt(line[2]);

        int cur = x;

        for (int i = 0; i < k; i++) {
            String[] swap = br.readLine().split(" ");
            int a = Integer.parseInt(swap[0]);
            int b = Integer.parseInt(swap[1]);

            if (cur == a)
                cur = b;
            else if (cur == b)
                cur = a;
        }

        bw.write(cur + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
