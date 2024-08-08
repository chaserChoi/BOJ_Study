import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        pw.println("int a;");

        for (int i = 1; i <= n; i++) {
            pw.print("int ");

            for (int j = 0; j < i; j++)
                pw.print("*");
            pw.print("ptr");

            if (i != 1) pw.print(i);
            pw.print(" = &");

            if (i == 1) pw.print("a");
            else if (i == 2) pw.print("ptr");
            else pw.print("ptr" + (i - 1));

            pw.println(";");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}
