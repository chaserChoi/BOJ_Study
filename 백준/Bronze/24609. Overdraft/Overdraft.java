import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int cur = 0;
        int min = 0;

        for (int i = 0; i < n; i++) {
            int trans = Integer.parseInt(br.readLine());
            cur += trans;

            if (cur < min)
                min = cur;
        }

        pw.println(-min);

        pw.flush();
        pw.close();
        br.close();
    }
}
