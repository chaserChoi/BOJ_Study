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
        int testCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCases; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long lt = Long.parseLong(st.nextToken());
            long wt = Long.parseLong(st.nextToken());
            long le = Long.parseLong(st.nextToken());
            long we = Long.parseLong(st.nextToken());

            long areaTelecomParisTech = lt * wt;
            long areaEurecom = le * we;

            if (areaTelecomParisTech > areaEurecom) bw.write("TelecomParisTech\n");
            else if (areaEurecom > areaTelecomParisTech) bw.write("Eurecom\n");
            else bw.write("Tie\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
