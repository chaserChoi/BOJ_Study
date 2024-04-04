import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if (A > B) bw.write(">");
        else if (A < B) bw.write("<");
        else bw.write("==");
        bw.flush();
        bw.close();
    }
}