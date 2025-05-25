import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] cards = new int[20];
        for (int i = 0; i < 20; i++)
            cards[i] = i + 1;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int left = a - 1;
            int right = b - 1;

            while (left < right) {
                int temp = cards[left];
                cards[left] = cards[right];
                cards[right] = temp;

                left++;
                right--;
            }
        }

        for (int i = 0; i < 20; i++) {
            bw.write(String.valueOf(cards[i]));

            if (i < 19)
                bw.write(" ");
        }
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}