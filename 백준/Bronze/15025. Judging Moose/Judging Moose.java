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

        int left = Integer.parseInt(st.nextToken());
        int right = Integer.parseInt(st.nextToken());

        if (left == 0 && right == 0) bw.write("Not a moose");
        else if (left == right) bw.write("Even " + (left + right));
        else bw.write("Odd " + 2 * Math.max(left, right));

        bw.flush();
        br.close();
        bw.close();
    }
}
