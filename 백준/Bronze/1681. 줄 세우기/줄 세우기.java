import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        char l = line[1].charAt(0);

        int cnt = 0;
        int curr = 1;

        while (cnt < n) {
            if (!Integer.toString(curr).contains(Character.toString(l)))
                cnt++;
            curr++;
        }

        pw.println(curr - 1);

        pw.flush();
        pw.close();
        br.close();
    }
}
