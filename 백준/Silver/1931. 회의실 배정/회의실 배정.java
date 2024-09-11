import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            meetings[i][0] = Integer.parseInt(line[0]);
            meetings[i][1] = Integer.parseInt(line[1]);
        }

        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1])
                    return Integer.compare(a[0], b[0]);
                return Integer.compare(a[1], b[1]);
            }
        });

        int cnt = 0;
        int last = 0;

        for (int[] m : meetings) {
            if (m[0] >= last) {
                cnt++;
                last = m[1];
            }
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
