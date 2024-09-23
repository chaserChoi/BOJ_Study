import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++)
            sb.append(i);

        String target = String.valueOf(n);

        int idx = sb.indexOf(target);

        pw.println(idx + 1);

        pw.flush();
        pw.close();
        br.close();
    }
}
