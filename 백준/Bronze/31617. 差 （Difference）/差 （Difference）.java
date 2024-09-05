import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int k = Integer.parseInt(br.readLine().trim());

        int n = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];
        String[] s1 = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s1[i]);

        int m = Integer.parseInt(br.readLine().trim());
        int[] b = new int[m];
        String[] s2 = br.readLine().trim().split(" ");
        for (int i = 0; i < m; i++)
            b[i] = Integer.parseInt(s2[i]);

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] + k == b[j])
                    cnt++;
            }
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
        br.close();
    }
}
