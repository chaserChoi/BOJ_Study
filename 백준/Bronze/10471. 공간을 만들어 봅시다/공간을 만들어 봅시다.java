import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int[] v = new int[p + 2];
        v[0] = 0;
        v[p + 1] = w;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= p; i++)
            v[i] = Integer.parseInt(st.nextToken());

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < p + 2; i++) {
            for (int j = i + 1; j < p + 2; j++)
                result.add(v[j] - v[i]);
        }

        List<Integer> sorted = new ArrayList<>(result);
        Collections.sort(sorted);

        for (int i = 0; i < sorted.size(); i++) {
            bw.write(String.valueOf(sorted.get(i)));
            if (i < sorted.size() - 1)
                bw.write(" ");
        }
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}