import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int b = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int max = 0;
        boolean flag = false;

        for (int i = 1; ; i++) {
            int black = (i * i) / 2;
            int white = (i * i) - black;

            if ((b >= black && w >= white) || (w >= black && b >= white)) {
                flag = true;
                max = i;
            } else
                break;
        }

        if (flag)
            pw.println(max);
        else
            pw.println("Impossible");

        pw.flush();
        pw.close();
        br.close();
    }
}
