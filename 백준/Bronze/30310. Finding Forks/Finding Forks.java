import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] forks = new int[n];

        for (int i = 0; i < n; i++)
            forks[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(forks);

        pw.println(forks[0] + forks[1]);

        pw.flush();
        pw.close();
        br.close();
    }
}
