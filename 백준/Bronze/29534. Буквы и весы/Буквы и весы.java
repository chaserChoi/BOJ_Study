import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int total = 0;

        for (char c : s.toCharArray())
            total += c - 'a' + 1;

        if (s.length() > n)
            pw.println("Impossible");
        else
            pw.println(total);

        pw.flush();
        pw.close();
        br.close();
    }
}
