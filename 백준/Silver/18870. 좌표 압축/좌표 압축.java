import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            x[i] = Integer.parseInt(st.nextToken());

        int[] sortedX = x.clone();
        Arrays.sort(sortedX);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sortedX[i]))
                map.put(sortedX[i], rank++);
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++)
            ans.append(map.get(x[i])).append(" ");

        pw.println(ans.toString().trim());

        pw.flush();
        pw.close();
        br.close();
    }
}
