import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new  StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            int idxA = -1;
            int idxB = -1;

            for (int j = 0; j < num; j++) {
                int curr = Integer.parseInt(st.nextToken());
                if (curr == a)
                    idxA = j;
                if (curr == b)
                    idxB = j;
            }

            if (idxA != -1 && idxB != -1 && idxB >= idxA)
                min = Math.min(min, cost);
        }

        if (min == Integer.MAX_VALUE)
            bw.write("-1");
        else
            bw.write(String.valueOf(min));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
