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

        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int startMinutes = 11 * 60 + 11;
        int endMinutes = ((D - 11) * 24 + H) * 60 + M;
        int result = endMinutes - startMinutes;

        if (result < 0) result = -1;

        bw.write(String.valueOf(result));
        bw.newLine();

        br.close();
        bw.flush();
        bw.close();
    }
}
