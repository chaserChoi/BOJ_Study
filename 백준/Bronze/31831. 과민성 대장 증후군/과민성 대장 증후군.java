import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int[] A = new int[n];
        String[] change = br.readLine().split(" ");

        for (int i = 0; i < n; i++)
            A[i] = Integer.parseInt(change[i]);

        int cur = 0;
        int pain = 0;

        for (int i = 0; i < n; i++) {
            cur += A[i];
            if (cur < 0)
                cur = 0;
            if (cur >= m)
                pain++;
        }

        pw.println(pain);

        pw.flush();
        pw.close();
        br.close();
    }
}
