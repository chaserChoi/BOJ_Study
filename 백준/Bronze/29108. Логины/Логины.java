import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        if (str.length() >= 3 && str.startsWith("io")) {
            String num = str.substring(2);
            if (num.matches("[0-9]*"))
                pw.println("Correct");
            else
                pw.println("Incorrect");
        } else
            pw.println("Incorrect");

        pw.flush();
        pw.close();
        br.close();
    }
}
