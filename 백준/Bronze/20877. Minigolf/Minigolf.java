import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] strokes = new int[n];

        for (int i = 0; i < n; i++)
            strokes[i] = Integer.parseInt(line[i]);

        int total = 0;

        for (int i = 0; i < n; i++) {
            int par = (i % 2 == 0) ? 2 : 3;
            int actual = Math.min(strokes[i], 7);
            total += (actual - par);
        }

        pw.println(total);

        br.close();
        pw.flush();
        pw.close();
    }
}
