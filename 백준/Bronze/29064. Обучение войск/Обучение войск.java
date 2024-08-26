import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");

        int ready = 0;

        for (String s : line) {
            int a = Integer.parseInt(s);
            if (a == 1)
                ready++;
        }

        int need = (n + 1) / 2;
        int add = Math.max(0, need - ready);

        pw.println(add);

        pw.flush();
        pw.close();
        br.close();
    }
}
