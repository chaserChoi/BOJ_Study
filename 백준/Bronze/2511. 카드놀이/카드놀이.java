import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");

        int aScore = 0;
        int bScore = 0;
        int winner = 0;

        for (int i = 0; i < 10; i++) {
            int aCard = Integer.parseInt(a[i]);
            int bCard = Integer.parseInt(b[i]);

            if (aCard > bCard) {
                aScore += 3;
                winner = 1;
            } else if (aCard < bCard) {
                bScore += 3;
                winner = 2;
            } else {
                aScore += 1;
                bScore += 1;
            }
        }

        pw.println(aScore + " " + bScore);

        if (aScore > bScore)
            pw.println("A");
        else if (aScore < bScore)
            pw.println("B");
        else {
            if (winner == 1)
                pw.println("A");
            else if (winner == 2)
                pw.println("B");
            else
                pw.println("D");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
