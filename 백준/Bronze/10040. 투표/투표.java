import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] costs = new int[n];
        for (int i = 0; i < n; i++)
            costs[i] = Integer.parseInt(br.readLine());

        int[] votes =new int[n];

        for (int i = 0; i < m; i++) {
            int budget = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                if (costs[j] <= budget) {
                    votes[j]++;
                    break;
                }
            }
        }

        int max = 0;
        int winner = -1;

        for (int i = 0; i < n; i++) {
            if (votes[i] > max) {
                max = votes[i];
                winner = i;
            }
        }

        bw.write(String.valueOf(winner + 1));
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}