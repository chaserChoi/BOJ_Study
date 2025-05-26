import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] baskets = new int[n + 1];
        for (int i = 1; i <= n; i++)
            baskets[i] = i;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>();

            for (int j = k; j <= end; j++)
                list.add(baskets[j]);

            for (int j = start; j <= k - 1; j++)
                list.add(baskets[j]);

            int temp = 0;
            for (int j = start; j <= end; j++) {
                baskets[j] = list.get(temp);
                temp++;
            }
        }

        for (int i = 1; i <= n; i++) {
            bw.write(String.valueOf(baskets[i]));
            if (i < n)
                bw.write(" ");
        }
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}
