import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        String[] aLine = br.readLine().split(" ");
        String[] bLine = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(aLine[i]);
            b[i] = Integer.parseInt(bLine[i]);
        }

        int total = 0;

        for (int i = 0; i < n; i++)
            total += Math.abs(a[i] - b[i]);

        pw.println(total / 2);

        pw.flush();
        pw.close();
        br.close();
    }
}
