import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int cuts = 0;

            if (n % 2 == 0)
                cuts += n / 2;
            else
                cuts += n / 2 + 1;

            if (n % 6 == 0 || n % 6 == 4)
                cuts += n / 3;
            else
                cuts += n / 3 + 1;

            pw.println(cuts);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
