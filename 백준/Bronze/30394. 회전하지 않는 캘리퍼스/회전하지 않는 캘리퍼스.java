import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            y[i] = Integer.parseInt(input[1]);
        }

        int maxY = Arrays.stream(y).max().getAsInt();
        int minY = Arrays.stream(y).min().getAsInt();

        int dist = maxY - minY;
        
        sb.append(dist).append("\n");

        pw.print(sb.toString());

        pw.flush();
        pw.close();
        br.close();
    }
}
