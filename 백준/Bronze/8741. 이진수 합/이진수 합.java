import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++)
            pw.print(1);
        for (int i = 0; i < k - 1; i++)
            pw.print(0);
        pw.println();

        pw.flush();
        pw.close();
        br.close();
    }
}
