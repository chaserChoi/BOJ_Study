import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int currNum = 1;

        while (n > 0) {
            if (n < currNum)
                currNum = 1;

            n -= currNum;
            cnt++;
            currNum++;
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
