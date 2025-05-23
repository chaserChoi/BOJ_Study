import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] targets = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)
            targets[i] = Integer.parseInt(st.nextToken());

        int[] total = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int currTarget = targets[i];

            int[] currGuesses = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                currGuesses[j] = Integer.parseInt(st.nextToken());

            int incorrect = 0;

            for (int j = 0; j < N; j++) {
                int num = j + 1;
                int guess = currGuesses[j];

                if (num != currTarget) {
                    if (guess == currTarget)
                        total[num]++;
                    else
                        incorrect++;
                }
            }

            total[currTarget] += 1 + incorrect;
        }

        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(total[i]));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
