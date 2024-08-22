import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[] votes = br.readLine().split(" ");

        int yes = 0;
        int no = 0;
        int abstain = 0;

        for (String v : votes) {
            int voteVal = Integer.parseInt(v);
            if (voteVal == 1)
                yes++;
            else if (voteVal == -1)
                no++;
            else if (voteVal == 0)
                abstain++;
        }

        if (abstain >= (n + 1) / 2)
            pw.println("INVALID");
        else if (yes > no)
            pw.println("APPROVED");
        else
            pw.println("REJECTED");

        pw.flush();
        pw.close();
        br.close();
    }
}
