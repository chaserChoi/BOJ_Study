import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String[] bread = br.readLine().split(" ");
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int cream = 0;

            for (int j = 0; j < k; j++) {
                if (Integer.parseInt(bread[i * k + j]) == 0)
                    cream++;
            }

            if (cream < p)
                cnt++;
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
