import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        String[] scoreA = br.readLine().split(" ");
        String[] scoreB = br.readLine().split(" ");

        int total = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scoreA[i]);
            int b = Integer.parseInt(scoreB[i]);

            if (a > b)
                total += 3;
            else if (a == b)
                total += 1;
        }

        pw.println(total);

        br.close();
        pw.flush();
        pw.close();
    }
}
