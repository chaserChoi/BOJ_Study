import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int[] marks = new int[n];
        int sum = 0;
        boolean hasSatis = false;
        boolean hasExcell = true;

        for (int i = 0; i < n; i++) {
            marks[i] = Integer.parseInt(br.readLine());
            sum += marks[i];
            if (marks[i] == 3)
                hasSatis = true;
            if (marks[i] != 5)
                hasExcell = false;
        }

        double avg = (double) sum / n;

        if (hasExcell)
            pw.println("Named");
        else if (!hasSatis && avg >= 4.5)
            pw.println("High");
        else if (!hasSatis)
            pw.println("Common");
        else
            pw.println("None");

        pw.flush();
        pw.close();
        br.close();
    }
}
