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

        int countOne = 0;
        int countTwo = 0;

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) countOne++;
            else if (num == 2) countTwo++;
        }

        if (countOne > countTwo) bw.write("1");
        else bw.write("2");

        bw.flush();
        bw.close();
        br.close();
    }
}
