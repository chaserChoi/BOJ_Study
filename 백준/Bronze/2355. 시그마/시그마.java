import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        long a = Long.parseLong(line[0]);
        long b = Long.parseLong(line[1]);

        long min = Math.min(a, b);
        long max = Math.max(a, b);

        long sum = (max - min + 1) * (min + max) / 2;

        pw.println(sum);

        pw.flush();
        pw.close();
        br.close();
    }
}
