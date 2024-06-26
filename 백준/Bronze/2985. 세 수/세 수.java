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

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A + B == C) bw.write(A + "+" + B + "=" + C);
        else if (A - B == C) bw.write(A + "-" + B + "=" + C);
        else if (A * B == C) bw.write(A + "*" + B + "=" + C);
        else if (A / B == C) bw.write(A + "/" + B + "=" + C);
        else if (A == B + C) bw.write(A + "=" + B + "+" + C);
        else if (A == B - C) bw.write(A + "=" + B + "-" + C);
        else if (A == B * C) bw.write(A + "=" + B + "*" + C);
        else if (A == B / C) bw.write(A + "=" + B + "/" + C);

        bw.flush();
        br.close();
        bw.close();
    }
}
