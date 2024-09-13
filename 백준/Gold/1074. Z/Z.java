import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        String[] parts = line.split(" ");

        int n = Integer.parseInt(parts[0]);
        int r = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        pw.println(z(n, r, c));

        pw.flush();
        pw.close();
        br.close();
    }

    static int z(int n, int r, int c) {
        if (n == 0)
            return 0;

        int h = 1 << (n - 1);
        if (r < h && c < h)
            return z(n - 1, r, c);
        else if (r < h && c >= h)
            return h * h + z(n - 1, r, c - h);
        else if (r >= h && c < h)
            return 2 * h * h + z(n - 1, r - h, c);
        else
            return 3 * h * h + z(n - 1, r - h, c - h);
    }
}
