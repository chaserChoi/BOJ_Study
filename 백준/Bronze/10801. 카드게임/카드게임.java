import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] cardsA = new int[10];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++)
            cardsA[i] = Integer.parseInt(st.nextToken());

        int[] cardsB = new int[10];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++)
            cardsB[i] = Integer.parseInt(st.nextToken());

        int winA = 0, winB = 0;

        for (int i = 0; i < 10; i++) {
            if (cardsA[i] > cardsB[i])
                winA++;
            else if (cardsA[i] < cardsB[i])
                winB++;
        }

        if (winA > winB)
            bw.write("A");
        else if (winA < winB)
            bw.write("B");
        else
            bw.write("D");
        bw.newLine();

        bw.flush();
        br.close();
        bw.close();
    }
}