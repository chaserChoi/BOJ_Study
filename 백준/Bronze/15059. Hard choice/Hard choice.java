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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int Ca = Integer.parseInt(st.nextToken());
        int Ba = Integer.parseInt(st.nextToken());
        int Pa = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int Cr = Integer.parseInt(st.nextToken());
        int Br = Integer.parseInt(st.nextToken());
        int Pr = Integer.parseInt(st.nextToken());

        int unhappy = 0;
        if (Cr > Ca) unhappy += Cr - Ca;
        if (Br > Ba) unhappy += Br - Ba;
        if (Pr > Pa) unhappy += Pr - Pa;

        bw.write(Integer.toString(unhappy));

        bw.newLine();

        br.close();
        bw.close();
    }
}
