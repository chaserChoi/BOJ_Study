import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 카드 개수
        int m = Integer.parseInt(st.nextToken()); // 블랙잭 목표 값

        int[] cards = new int[n]; // 카드에 쓰여 있는 수
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            cards[i] = Integer.parseInt(st.nextToken());

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= m) {
                        max = Math.max(max, sum);
                    } else if (sum == m) {
                        bw.write(sum + "\n");
                        bw.flush();
                        br.close();
                        bw.close();
                        return;
                    }
                }
            }
        }
        bw.write(max + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
