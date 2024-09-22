import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        int p = 5;
        for(int i = 2; i <= n; i++)
            p = (p + 3 * i + 1) % 45678;

        pw.print(p);

        pw.flush();
        pw.close();
        br.close();
    }
}
