import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);

        int ans = 0;

        if (a == 0)
            ans = c * c - b;
        else if (b == 0)
            ans = c * c - a;
        else if (c == 0)
            ans = (int)Math.sqrt(a + b);

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}
