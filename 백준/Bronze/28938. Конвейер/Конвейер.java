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

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
        }

        if (sum > 0) bw.write("Right");
        else if (sum < 0) bw.write("Left");
        else bw.write("Stay");

        bw.flush();
        bw.close();
        br.close();
    }
}
