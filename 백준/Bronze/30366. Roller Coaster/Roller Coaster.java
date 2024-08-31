import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int[] a = new int[n];
        line = br.readLine().split(" ");

        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(line[i]);

        int currTime = 0;
        int currLoad = 0;

        for (int i = 0; i < n; i++) {
            currLoad += a[i];

            if (currLoad > m) {
                currTime++;
                currLoad = a[i];
            }

            sb.append(currTime).append("\n");
        }

        pw.print(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
