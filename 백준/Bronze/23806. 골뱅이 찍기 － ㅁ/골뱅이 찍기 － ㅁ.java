import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n * 5; j++)
                pw.print("@");
            pw.println();
        }

        for (int i = 0; i < n * 3; i++)
        {
            for (int j = 0; j < n; j++)
                pw.print("@");
            for (int j = 0; j < n * 3; j++)
                pw.print(" ");
            for (int j = 0; j < n; j++)
                pw.print("@");
            pw.println();
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n * 5; j++)
                pw.print("@");
            pw.println();
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
