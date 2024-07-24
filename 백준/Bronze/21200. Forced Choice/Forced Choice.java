import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int p = Integer.parseInt(line[1]);
        int s = Integer.parseInt(line[2]);

        Set<Integer> cards = new HashSet<>();
        for (int i = 1; i <= n; i++)
            cards.add(i);

        for (int i = 0; i < s; i++) {
            String[] line2 = br.readLine().split(" ");
            int m = Integer.parseInt(line2[0]);
            Set<Integer> chosen = new HashSet<>();

            for (int j = 1; j <= m; j++) {
                int card = Integer.parseInt(line2[j]);
                chosen.add(card);
            }

            if (chosen.contains(p)) {
                bw.write("KEEP\n");
                cards.retainAll(chosen);
            } else {
                bw.write("REMOVE\n");
                cards.removeAll(chosen);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
