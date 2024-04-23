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

        int width = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        double totalAcres = (double)width * length / 4840;
        int bagsNeeded = (int)Math.ceil(totalAcres / 5);

        bw.write(String.valueOf(bagsNeeded));

        bw.flush();
        bw.close();
        br.close();
    }
}
